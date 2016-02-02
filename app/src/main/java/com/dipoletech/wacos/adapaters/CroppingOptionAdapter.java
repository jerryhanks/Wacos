package com.dipoletech.wacos.adapaters;/**
 * Created by DABBY(3pleMinds) on 30-Nov-15.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dipoletech.wacos.R;
import com.dipoletech.wacos.util.CroppingOption;

import java.util.ArrayList;

/**
 * DABBY(3pleMinds) 30-Nov-15 8:58 PM 2015 11
 * 30 20 58 NigerianSocietyOfEngineers
 **/
public class CroppingOptionAdapter extends ArrayAdapter {

    private ArrayList<CroppingOption> mOptions;
    private LayoutInflater mInflater;

    public CroppingOptionAdapter(Context context, ArrayList options) {
        super(context, R.layout.croping_selector, options);

        mOptions = options;

        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup group) {
        if (convertView == null)
            convertView = mInflater.inflate(R.layout.croping_selector, null);

        CroppingOption item = mOptions.get(position);

        if (item != null) {
            ((ImageView) convertView.findViewById(R.id.img_icon)).setImageDrawable(item.icon);
            ((TextView) convertView.findViewById(R.id.txt_name)).setText(item.title);

            return convertView;
        }

        return null;
    }

}