package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
/* loaded from: classes3.dex */
public class NotifyingScrollView extends ScrollView {

    /* loaded from: classes3.dex */
    public interface a {
    }

    public NotifyingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
    }

    public NotifyingScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    public void setOnScrollListener(a aVar) {
    }
}
