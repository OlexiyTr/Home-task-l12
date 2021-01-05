package com.example.home_task_l12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.home_task_l12.databinding.MyDialogFragmentBinding

class MyDialogFragment : DialogFragment(){

    private lateinit var binding : MyDialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyDialogFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart(){
        super.onStart()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
    }

}