package com.aau.chs.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.aau.chs.R
import com.aau.chs.SchoolsRecyclerAdapter
import com.aau.chs.TopSpacingItemDecoration
import kotlinx.android.synthetic.main.home_page_fragment.*

class HomePageFragment : Fragment() {

    companion object {
        fun newInstance() = HomePageFragment()
    }

    private lateinit var viewModel: HomePageViewModel
    private lateinit var schoolAdapter: SchoolsRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.home_page_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomePageViewModel::class.java)
        initRecyclerView()
        addDataSet()
    }

    private fun initRecyclerView() {
        schools_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            val topSpacingItemDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            schoolAdapter = SchoolsRecyclerAdapter()
            adapter = schoolAdapter
        }
    }

    private fun addDataSet() {
        viewModel.schools.observe(viewLifecycleOwner, Observer {
            schoolAdapter.submitList(it)
        })
    }

}
