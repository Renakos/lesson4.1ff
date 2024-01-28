package com.example.lesson41ff.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson41ff.Adaptern4d
import com.example.lesson41ff.ItemModel3
import com.example.lesson41ff.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private var work = mutableListOf<ItemModel3>()
    private var adapter = Adaptern4d(work)
    private var _binding: FragmentThirdBinding? = null
    private val binding: FragmentThirdBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rv.adapter = adapter

        addDataIfNeeded()
    }

    private fun addDataIfNeeded() {

        if (work.isEmpty()) {
            work.add(ItemModel3("FirstDataOfSecondFragment", "SecondDataOfSecondFragment"))
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
