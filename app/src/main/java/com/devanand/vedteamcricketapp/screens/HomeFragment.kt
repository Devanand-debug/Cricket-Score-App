package com.devanand.vedteamcricketapp.screens

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavDestination
import androidx.navigation.fragment.findNavController
import com.devanand.vedteamcricketapp.R
import com.devanand.vedteamcricketapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Set toolbar title when fragment is created
        (requireActivity() as AppCompatActivity).supportActionBar?.title = "Home"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStartMatch.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_openingPlayerFragment)
        }

//        var team1Str = ""
//        val textWatcher = object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                if (s?.isNotEmpty() == true){
//                    team1Str = binding.etTeam1.text.toString()
//                   // binding.etDay.setBackgroundResource(R.drawable.dob_border)
//                   // validateInputs()
//                }
//
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
//        }
//
//        binding.etTeam1.addTextChangedListener(textWatcher)
//        binding.etTeam2.addTextChangedListener(textWatcher)
//        binding.etMonth.addTextChangedListener(textWatcher)
//        binding.etYear.addTextChangedListener(textWatcher)


        binding.etTeam1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().isNotEmpty()){
                    binding.radioButton1.text = s.toString()
                }else{
                    binding.radioButton1.text = getString(R.string.team1)
                }

            }

        })

        binding.etTeam2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(s.toString().isNotEmpty()){
                    binding.radioButton2.text = s.toString()
                }else{
                    binding.radioButton2.text = getString(R.string.team2)
                }

            }

        })


    }

}