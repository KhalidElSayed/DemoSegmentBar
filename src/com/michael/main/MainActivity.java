package com.michael.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.michael.component.segmentbar.SegmentBar;
import com.michael.component.segmentbar.SegmentBar.OnSegmentBarChangedListener;

/**
 * This class shows how to use SegmentBar component.
 * You can set the number of bar items,text size,text color,and specify the default selected bar.
 * 
 * 这个类展示的是如何使用分段控件。
 * 你可以设置分段控件中子按钮的数量，文字的大小和颜色，并制定默认选中的子按钮
 * 
 * @author MichaelYe
 * @since 2012-8-21
 * */
public class MainActivity extends Activity 
{

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.text_view);
        
        SegmentBar segmentBar = (SegmentBar)findViewById(R.id.segment_bar);
        segmentBar.setValue(MainActivity.this, new String[]{"Item0", "Item1", "Item2", "Item3"});
        segmentBar.setTextSize(13);
        segmentBar.setTextColor(this.getResources().getColor(R.color.deep_gray));
        segmentBar.setDefaultBarItem(0);
        segmentBar.setOnSegmentBarChangedListener(new OnSegmentBarChangedListener()
        {
			@Override
			public void onBarItemChanged(int segmentItemIndex) 
			{
				textView.setText(segmentItemIndex+"");
			}
		});
    }
    
}
