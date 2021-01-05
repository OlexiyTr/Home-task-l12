package com.example.home_task_l12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_task_l12.databinding.MyBottomSheetDialogFragmnetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetDialogFragment : BottomSheetDialogFragment(){

    private lateinit var binding: MyBottomSheetDialogFragmnetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyBottomSheetDialogFragmnetBinding.inflate(inflater,container,false)
        return binding.root
    }

}