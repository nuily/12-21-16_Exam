package nyc.c4q.huilin.a12_21_16_exam.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import nyc.c4q.huilin.a12_21_16_exam.R;
import nyc.c4q.huilin.a12_21_16_exam.model.backend.StateConstants;

/**
 * Created by huilin on 12/21/16.
 */

public class OneTwoView extends LinearLayout {

    private LinearLayout layout;
    private TextView changingTV;
    private Context mContext = null;

    public OneTwoView(Context context) {
        super(context);
        mContext = context;
    }

    public OneTwoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.OneTwoView);
        String oneText = a.getString(R.styleable.OneTwoView_oneText);
        String twoText = a.getString(R.styleable.OneTwoView_twoText);

        oneText = StateConstants.ONE;
        twoText = StateConstants.TWO;

        String service = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(service);

        layout = (LinearLayout) li.inflate(R.layout.activity_extracred, this, true);

        changingTV = (TextView) layout.findViewById(R.id.tv_changing);

        changingTV.setText(oneText);

        a.recycle();


    }

//    @Override
//    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
//        ViewGroup.MarginLayoutParams margins = ViewGroup.MarginLayoutParams.class.cast(getLayoutParams());
//        int margin = determineDp(10);
//        margins.topMargin = margin;
//        margins.bottomMargin = margin;
//        margins.leftMargin = margin;
//        margins.rightMargin = margin;
//        setLayoutParams(margins);
//
//    }
//
//    private int determineDp(int dpValue) {
//        float d = getContext().getResources().getDisplayMetrics().density;
//        return (int)(dpValue * d);
//    }


}
