package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentQuizBinding
import com.example.quizapp.databinding.FragmentResultBinding

class Result : Fragment() {

    private lateinit var resultBinding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        resultBinding = FragmentResultBinding.inflate(inflater, container, false)
        val playAgainButton = resultBinding.playAgainBtn
        playAgainButton.setOnClickListener {
            val navController = findNavController()
            val action = ResultDirections.actionResultToWelcome()
            navController.navigate(action)
        }
        return resultBinding.root
    }

}