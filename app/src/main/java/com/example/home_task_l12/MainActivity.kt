package com.example.home_task_l12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.afollestad.materialdialogs.MaterialDialog
import com.example.home_task_l12.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.bottom_sheet_fragment.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout> by lazy{
        BottomSheetBehavior.from(
            binding.root.bottomSheetParentContainer
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBindnig()
        setupBottomSheet()
        setupListeners()
    }

    private fun setupBindnig(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners(){
        binding.btnAlertDialog.setOnClickListener{
            showAlertDialog()
        }
        binding.btnDialogFragment.setOnClickListener {
            showDialogFragment()
        }
        binding.btnBottomSheetDialogFragment.setOnClickListener {
            showBottomSheetDialogFragment()
        }
        binding.btnBottonSheet.setOnClickListener {
            showBottomSheet()
        }
    }

    private fun showAlertDialog(){
        MaterialDialog(this).show{
            title(text = "Alert dialog title")
            message(text = "Alert dialog message")
            positiveButton(text = "Agree"){dialog ->
                Toast.makeText(this@MainActivity,"AGREE",Toast.LENGTH_SHORT).show()
            }
            negativeButton(text = "Disagree"){dialog ->
                Toast.makeText(this@MainActivity,"DISAGREE",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showDialogFragment(){
        val dialog = MyDialogFragment()
        supportFragmentManager
            .beginTransaction()
            .add(dialog,"TAG")
            .commitAllowingStateLoss()
    }

    private fun showBottomSheetDialogFragment(){
        val dialog = MyBottomSheetDialogFragment()
        supportFragmentManager
            .beginTransaction()
            .add(dialog,"TAG")
            .commitNowAllowingStateLoss()
    }

    private fun showBottomSheet(){
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }

    private fun setupBottomSheet(){
        bottomSheetBehavior.state =BottomSheetBehavior.STATE_HIDDEN
    }

}