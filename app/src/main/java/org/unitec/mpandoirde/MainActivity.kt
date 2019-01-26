package org.unitec.mpandoirde

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_bar_chart.*

class MainActivity : AppCompatActivity() {
    var btnBarChart: Button? = null
    var btnPieChart:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chart = barchart as BarChart;

        var NoOfEmp = arrayListOf<BarEntry>();

        NoOfEmp.add(BarEntry(0f, 30f));
        NoOfEmp.add(BarEntry(1f, 81f));
        NoOfEmp.add( BarEntry(2f, 62f));
        NoOfEmp.add( BarEntry(3f, 53f));
        NoOfEmp.add( BarEntry(4f, 44f));
        NoOfEmp.add(BarEntry(5f, 75f));
        NoOfEmp.add( BarEntry(6f, 56f));


        var year =  arrayListOf<String>();

        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        year.add("2015");
        year.add("2016");
        year.add("2017");

        var bardataset = BarDataSet(NoOfEmp, "Empleados");
        chart.animateY(5000);
       var data =  BarData(bardataset);

      // bardataset.setColors(ColorTemplate.COLORFUL_COLORS)

        bardataset.setColors(Color.RED, Color.rgb(2,203,6))
        chart.setData(data);
        data.setBarWidth(0.9f)

        chart.setFitBars(true)
        chart.invalidate()
    }


    }


