package com.example.quiz

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var questionNumber :Int = 1
    var isFound : Boolean = false
    var success = 0
    var questions = arrayListOf<String>("In which continent are Chile, Argentina and Brazil?",
        "Which composer scored 2000s classics such as Gladiator, Hannibal, Madagascar and Black Hawk Down?",
        "Which brand of soup featured in one of Andy Warhol’s most famous pop art pieces?",
        "In which city were the 1992 Summer Olympics held?",
        "Which of the following is not an international organisation?",
        "Which is the easiest way to tell the age of many trees?",
        "What is the most points that a player can score with a single throw in darts?",
        "What does the term “SOS” commonly stand for?",
        "What is the rarest type of blood in the human body?",
        "How many holes are on a standard bowling ball?" )
    var buttonText1 = arrayListOf<String>("North America","Hans Zimmer", "Heinz", "Atlanta","FIFA","To measure the width of the tree","20","Save Our Sheep","AB negative","1")
    var buttonText2 = arrayListOf<String>("South America", "John Williams", "Campbell’s" , "Barcelona","NATO","To count the rings on the trunk","40","Save Our Ship","O positive","2")
    var buttonText3 = arrayListOf<String>("Europe", "Danny Elfman", "Baxters", "Sydney","ASEAN","To count the number of leaves","60","Save Our Seal","B negative","3")
    var buttonText4 = arrayListOf<String>("Australasia", "James Horner",  "Knorr", "Ankara","FBI","To measure the height of the tree","80","Save Our Souls","A positive","4")
    var results = arrayListOf<Int>(2,1,2,2,4,2,3,4,1,3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newQuestion(textView3)
    }
    private fun newQuestion(view: View){
        isFound = false
        button1.setBackgroundColor(Color.BLUE)
        button2.setBackgroundColor(Color.BLUE)
        button3.setBackgroundColor(Color.BLUE)
        button4.setBackgroundColor(Color.BLUE)
        buttonNext.setBackgroundColor(Color.BLUE)
        textView3.text = "Question-${questionNumber}"
        textView4.text = questions.get(questionNumber -1)
        button1.text = buttonText1.get(questionNumber-1)
        button2.text = buttonText2.get(questionNumber-1)
        button3.text = buttonText3.get(questionNumber-1)
        button4.text = buttonText4.get(questionNumber-1)
    }

    fun clicked1(view: View){
        if (!isFound){
            if(results.get(questionNumber-1) == 1){
                button1.setBackgroundColor(Color.GREEN)
                isFound = true
                success++
            }
            else {
                button1.setBackgroundColor(Color.RED)
                isFound = true
            }
        }
    }

    fun clicked2(view: View){
        if (!isFound){
            if(results.get(questionNumber-1) == 2){
                button2.setBackgroundColor(Color.GREEN)
                isFound = true
                success++
            }
            else {
                button2.setBackgroundColor(Color.RED)
                isFound = true
            }
        }

    }

    fun clicked3(view: View){
        if (!isFound){
            if(results.get(questionNumber-1) == 3){
                button3.setBackgroundColor(Color.GREEN)
                isFound = true
                success++
            }
            else {
                button3.setBackgroundColor(Color.RED)
                isFound = true
            }
        }

    }

    fun clicked4(view: View){
        if (!isFound){
            if(results.get(questionNumber-1) == 4){
                button4.setBackgroundColor(Color.GREEN)
                isFound = true
                success++
            }
            else {
                button4.setBackgroundColor(Color.RED)
                isFound = true
            }
        }
    }

    fun goNext(view: View){
        if (questionNumber < questions.size){
            questionNumber++
            newQuestion(textView3)
        } else {
            buttonNext.visibility = View.INVISIBLE
            linearLayout2.visibility = View.INVISIBLE
            textView3.text = "Congratulations, \n You got ${success}/${questions.size}!!"
            textView4.visibility = View.INVISIBLE
        }
    }



}