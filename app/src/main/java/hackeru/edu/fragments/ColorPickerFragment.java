package hackeru.edu.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorPickerFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
    EditText etRed, etGreen, etBlue, etResult;
    SeekBar sbRed, sbGreen, sbBlue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_color_picker, container, false);

        etRed = (EditText) v.findViewById(R.id.etRed);
        etGreen = (EditText) v.findViewById(R.id.etGreen);
        etBlue = (EditText) v.findViewById(R.id.etBlue);
        etResult = (EditText) v.findViewById(R.id.etResult);

        sbRed = (SeekBar) v.findViewById(R.id.sbRed);
        sbGreen = (SeekBar) v.findViewById(R.id.sbGreen);
        sbBlue = (SeekBar) v.findViewById(R.id.sbBlue);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        return v;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int red = sbRed.getProgress();
        int green = sbGreen.getProgress();
        int blue = sbBlue.getProgress();

        int color = Color.rgb(red, green, blue);
        String hex = Integer.toHexString(color);

        etResult.setText(hex);
        etResult.setBackgroundColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
