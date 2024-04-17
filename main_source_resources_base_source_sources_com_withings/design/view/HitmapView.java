package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class HitmapView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f36239a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f36240b;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public HitmapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getCircleSize() {
        ArrayList arrayList = this.f36239a;
        if (arrayList.isEmpty() || ((List) arrayList.get(0)).isEmpty()) {
            return 0;
        }
        return ((ValueCircleView) ((List) arrayList.get(0)).get(0)).getMeasuredWidth();
    }

    private int getLegendHeight() {
        ArrayList arrayList = this.f36240b;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((TextView) arrayList.get(0)).getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        ArrayList arrayList = this.f36240b;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f36239a;
            if (!arrayList2.isEmpty()) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    List list = (List) arrayList2.get(i15);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        ValueCircleView valueCircleView = (ValueCircleView) list.get(i16);
                        int measuredWidth = valueCircleView.getMeasuredWidth() * i16;
                        int measuredHeight = valueCircleView.getMeasuredHeight() * i15;
                        valueCircleView.layout(measuredWidth, measuredHeight, valueCircleView.getMeasuredWidth() + measuredWidth, valueCircleView.getMeasuredHeight() + measuredHeight);
                    }
                }
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TextView textView = (TextView) arrayList.get(i17);
                    int measuredWidth2 = textView.getMeasuredWidth() * i17;
                    int size = arrayList2.size() * getCircleSize();
                    textView.layout(measuredWidth2, size, textView.getMeasuredWidth() + measuredWidth2, textView.getMeasuredHeight() + size);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        ArrayList arrayList = this.f36240b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).measure(View.MeasureSpec.makeMeasureSpec(size / arrayList.size(), ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH), 0);
        }
        if (!arrayList.isEmpty()) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size / arrayList.size(), ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH);
            Iterator it2 = this.f36239a.iterator();
            while (it2.hasNext()) {
                for (ValueCircleView valueCircleView : (List) it2.next()) {
                    valueCircleView.measure(makeMeasureSpec, makeMeasureSpec);
                }
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setHitmap(a aVar) {
        throw null;
    }

    public HitmapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36239a = new ArrayList();
        this.f36240b = new ArrayList();
        TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
    }
}
