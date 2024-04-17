package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public class CustomNestedScrollView extends LockableScrollView {
    private CustomFrameLayout P;
    private View Q;
    private ViewGroup R;
    private int S;
    private int T;
    private boolean W;

    /* renamed from: l0  reason: collision with root package name */
    private int f46533l0;

    /* renamed from: m0  reason: collision with root package name */
    private c f46534m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f46535n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f46536o0;

    /* loaded from: classes4.dex */
    final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CustomNestedScrollView customNestedScrollView = CustomNestedScrollView.this;
            customNestedScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            customNestedScrollView.P.setContainerHeight(customNestedScrollView.getHeight());
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void K1(int i11, int i12);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void onScrolled(CustomNestedScrollView customNestedScrollView, int i11);
    }

    public CustomNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = false;
        this.f46536o0 = new a();
    }

    private void B(int i11) {
        View view;
        View view2 = this.Q;
        if (view2 != null) {
            view2.setTranslationY(getScrollY());
            if ((i11 > 0 || (i11 < 0 && getScrollY() < this.S - this.T)) && (view = this.Q) != null) {
                this.Q.getLayoutParams().height = Math.min(this.S, Math.max(this.T, view.getLayoutParams().height - i11));
                this.Q.requestLayout();
            }
        }
    }

    public final void C(int i11) {
        this.f46535n0 = false;
        int scrollY = i11 - getScrollY();
        scrollBy(0, scrollY);
        B(scrollY);
        this.f46535n0 = true;
    }

    public final Float D() {
        float f11;
        int i11 = 1;
        while (true) {
            if (i11 <= this.R.getChildCount()) {
                if (this.R.getChildAt(i11).getId() == C1987R.id.section_temperature) {
                    f11 = this.R.getChildAt(i11).getY();
                    break;
                }
                i11++;
            } else {
                f11 = 0.0f;
                break;
            }
        }
        return Float.valueOf(f11);
    }

    public final void E(View view, ViewGroup viewGroup, CustomFrameLayout customFrameLayout, int i11, int i12) {
        this.Q = view;
        this.R = viewGroup;
        this.P = customFrameLayout;
        this.T = i11;
        this.S = i12;
        getViewTreeObserver().addOnGlobalLayoutListener(this.f46536o0);
        customFrameLayout.setOffset(i12 - i11);
    }

    public final void F(int i11) {
        this.f46533l0 = i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f46536o0);
        getViewTreeObserver().dispatchOnGlobalLayout();
        this.P = null;
        this.Q = null;
        this.R = null;
        this.f46534m0 = null;
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        super.onLayout(z5, i11, i12, i13, i14);
        if (!this.W) {
            this.W = true;
            ((ViewGroup.MarginLayoutParams) this.R.getLayoutParams()).setMargins(0, this.S, 0, 0);
            this.R.requestLayout();
            if (getScrollY() > 0) {
                scrollTo(0, 0);
            }
            C(this.f46533l0);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected final void onScrollChanged(int i11, int i12, int i13, int i14) {
        if (!this.f46535n0) {
            return;
        }
        B(i12 - i14);
        if (!isInLayout() && this.f46534m0 != null) {
            this.f46533l0 = getScrollY();
            this.f46534m0.onScrolled(this, getScrollY());
        }
    }

    public void setDelegate(c cVar) {
        this.f46534m0 = cVar;
    }

    public CustomNestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.W = false;
        this.f46536o0 = new a();
    }
}
