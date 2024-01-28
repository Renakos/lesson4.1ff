package com.example.lesson41ff.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson41ff.Adaptern2d
import com.example.lesson41ff.ItemModel
import com.example.lesson41ff.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var work = mutableListOf<ItemModel>()
    private var adapter = Adaptern2d(work)
    private var _binding: FragmentFirstBinding? = null
    private val binding: FragmentFirstBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rv.adapter = adapter

        addDataIfNeeded()
    }

    private fun addDataIfNeeded() {

        if (work.isEmpty()) {
            work.add(ItemModel("FirstDataOfSecondFragment", "SecondDataOfSecondFragment"))
            adapter.notifyDataSetChanged()
        } else {
            Log.e("HandledError", "ErrorHandled")
        }
    }

    override fun onResume() {
        super.onResume()
        addDataIfNeeded()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
