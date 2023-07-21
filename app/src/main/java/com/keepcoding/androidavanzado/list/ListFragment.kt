package com.keepcoding.androidavanzado.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.keepcoding.androidavanzado.R
import com.keepcoding.androidavanzado.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding : FragmentListBinding
    private val viewModel: ListFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        val adapter = ListAdapter()
        adapter.submit(viewModel.getHeroList())

        with(binding) {
            rvHeroes.adapter = adapter
            rvHeroes.layoutManager = LinearLayoutManager(binding.root.context)
        }


        // Inflate the layout for this fragment
        return binding.root
    }







}