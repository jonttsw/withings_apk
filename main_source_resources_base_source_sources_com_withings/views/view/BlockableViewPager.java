package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class BlockableViewPager extends ViewPager {
    private boolean C0;

    /* loaded from: classes4.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final BlockableViewPager f46502a;

        public a(BlockableViewPager blockableViewPager) {
            this.f46502a = blockableViewPager;
        }

        @Override // com.withings.views.view.BlockableViewPager.b
        public final void Q1(boolean z5) {
            this.f46502a.setPagingEnabled(z5);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void Q1(boolean z5);
    }

    public BlockableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.C0) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                return false;
            }
        }
        return false;
    }

    public void setPagingEnabled(boolean z5) {
        this.C0 = z5;
    }
}
