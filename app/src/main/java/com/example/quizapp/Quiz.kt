package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.quizapp.databinding.FragmentQuizBinding

class Quiz : Fragment() {

    private lateinit var quizBinding: FragmentQuizBinding
    val arguments : QuizArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        quizBinding = FragmentQuizBinding.inflate(inflater, container, false)
        val name = arguments.name
        val welcomeTextWithPlaceholders = resources.getString(R.string.welcome_banner_text)
        val welcomeText = String.format(welcomeTextWithPlaceholders, name)
        val welcomeBanner = quizBinding.quizBanner
        welcomeBanner.text = welcomeText


        val submitButton = quizBinding.submitBtn
        submitButton.setOnClickListener {
            val navController = findNavController()
            val action = QuizDirections.actionQuizToResult()
            navController.navigate(action)

        }
        return quizBinding.root
    }

}