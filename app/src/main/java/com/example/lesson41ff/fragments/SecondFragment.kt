package com.example.lesson41ff.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson41ff.Adaptern3d
import com.example.lesson41ff.Count2
import com.example.lesson41ff.ItemModel2
import com.example.lesson41ff.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var work = mutableListOf<ItemModel2>()
    private var adapter = Adaptern3d(work)
    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rv.adapter = adapter

        addDataIfNeeded()
    }

    private fun addDataIfNeeded() {

        if (work.isEmpty()) {
            work.add(ItemModel2("FirstDataOfSecondFragment", "SecondDataOfSecondFragment"))
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
