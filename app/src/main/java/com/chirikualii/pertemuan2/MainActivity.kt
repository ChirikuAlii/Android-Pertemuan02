package com.chirikualii.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    var scoreA = 0
    var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTeamAPlus.setOnClickListener {
            scoreA += 1
            binding.tvTeamAScore.text = scoreA.toString()
        }

        binding.btnTeamAMinus.setOnClickListener {
            if (scoreA > 0){
                scoreA -= 1
                binding.tvTeamAScore.text = scoreA.toString()
            }
        }

        binding.btnTeamBPlus.setOnClickListener {
            scoreB += 1
            binding.tvTeamBScore.text = scoreB.toString()
        }

        binding.btnTeamBMinus.setOnClickListener {
            if (scoreB > 0){
                scoreB -= 1
                binding.tvTeamBScore.text = scoreB.toString()
            }
        }

        binding.btnReset.setOnClickListener {

            scoreB = 0
            scoreA = 0

            binding.tvTeamAScore.text = scoreA.toString()
            binding.tvTeamBScore.text = scoreB.toString()
        }
    }
}