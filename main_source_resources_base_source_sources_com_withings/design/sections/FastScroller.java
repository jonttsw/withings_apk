package com.withings.design.sections;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public class FastScroller extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f36100a;

    /* renamed from: b  reason: collision with root package name */
    private int f36101b;

    /* renamed from: c  reason: collision with root package name */
    private int f36102c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36103d;

    /* renamed from: e  reason: collision with root package name */
    private d f36104e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPropertyAnimator f36105f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPropertyAnimator f36106g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f36107h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f36108i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f36109j;

    /* renamed from: k  reason: collision with root package name */
    private View f36110k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f36111l;

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FastScroller.a(FastScroller.this);
        }
    }

    /* loaded from: classes3.dex */
    final class b extends RecyclerView.p {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void a(int i11, RecyclerView recyclerView) {
            FastScroller fastScroller = FastScroller.this;
            if (fastScroller.isEnabled()) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        fastScroller.getHandler().removeCallbacks(fastScroller.f36111l);
                        FastScroller.k(fastScroller, fastScroller.f36105f);
                        if (!FastScroller.m(fastScroller, fastScroller.f36110k)) {
                            fastScroller.o();
                        }
                    }
                } else if (fastScroller.f36103d && !fastScroller.f36108i.isSelected()) {
                    fastScroller.getHandler().postDelayed(fastScroller.f36111l, 1000L);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void b(RecyclerView recyclerView, int i11, int i12) {
            FastScroller fastScroller = FastScroller.this;
            if (!fastScroller.f36108i.isSelected() && fastScroller.isEnabled()) {
                fastScroller.setViewPositions(FastScroller.f(fastScroller, recyclerView));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class c extends AnimatorListenerAdapter {
    }

    /* loaded from: classes3.dex */
    public interface d {
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void a(FastScroller fastScroller) {
        fastScroller.f36105f = fastScroller.f36110k.animate().translationX(fastScroller.getResources().getDimensionPixelSize(C1987R.dimen.fastscroll_scrollbar_padding)).alpha(0.0f).setDuration(300L).setListener(new com.withings.design.sections.c(fastScroller));
    }

    static float f(FastScroller fastScroller, RecyclerView recyclerView) {
        fastScroller.getClass();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float f11 = fastScroller.f36102c;
        return (computeVerticalScrollOffset / (recyclerView.computeVerticalScrollRange() - f11)) * f11;
    }

    static void k(FastScroller fastScroller, ViewPropertyAnimator viewPropertyAnimator) {
        fastScroller.getClass();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    static boolean m(FastScroller fastScroller, View view) {
        fastScroller.getClass();
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f36110k.setTranslationX(getResources().getDimensionPixelSize(C1987R.dimen.fastscroll_scrollbar_padding));
        this.f36110k.setVisibility(0);
        this.f36105f = this.f36110k.animate().translationX(0.0f).alpha(1.0f).setDuration(300L).setListener(new AnimatorListenerAdapter());
    }

    private void setHandleSelected(boolean z5) {
        int i11;
        this.f36108i.setSelected(z5);
        if (z5) {
            i11 = this.f36100a;
        } else {
            i11 = this.f36101b;
        }
        androidx.core.graphics.drawable.a.l(null, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewPositions(float f11) {
        int height = this.f36107h.getHeight();
        int height2 = this.f36108i.getHeight();
        int i11 = height2 / 2;
        this.f36107h.setY(Math.min(Math.max(0, (int) (f11 - height)), (this.f36102c - height) - i11));
        this.f36108i.setY(Math.min(Math.max(0, (int) (f11 - i11)), this.f36102c - height2));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f36102c = i12;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        int action = motionEvent.getAction();
        Runnable runnable = this.f36111l;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            setHandleSelected(false);
            if (this.f36103d) {
                getHandler().postDelayed(runnable, 1000L);
            }
            TextView textView2 = this.f36107h;
            if (textView2 != null && textView2.getVisibility() == 0) {
                this.f36106g = this.f36107h.animate().alpha(0.0f).setDuration(100L).setListener(new com.withings.design.sections.b(this));
            }
            return true;
        } else if (motionEvent.getX() < this.f36108i.getX() - u0.w(this.f36108i)) {
            return false;
        } else {
            setHandleSelected(true);
            getHandler().removeCallbacks(runnable);
            ViewPropertyAnimator viewPropertyAnimator = this.f36105f;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f36106g;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            View view = this.f36110k;
            if (view == null || view.getVisibility() != 0) {
                o();
            }
            if (this.f36104e != null && ((textView = this.f36107h) == null || textView.getVisibility() != 0)) {
                this.f36107h.setVisibility(0);
                this.f36106g = this.f36107h.animate().alpha(1.0f).setDuration(100L).setListener(new AnimatorListenerAdapter());
            }
        }
        float y11 = motionEvent.getY();
        setViewPositions(y11);
        setRecyclerViewPosition(y11);
        return true;
    }

    public void setBubbleColor(int i11) {
        this.f36100a = i11;
        TextView textView = this.f36107h;
        getContext();
        Drawable mutate = androidx.core.content.a.getDrawable(getContext(), C1987R.drawable.fastscroll_bubble).mutate();
        androidx.core.graphics.drawable.a.l(mutate, i11);
        textView.setBackground(mutate);
    }

    public void setBubbleTextColor(int i11) {
        this.f36107h.setTextColor(i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        int i11;
        super.setEnabled(z5);
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
    }

    public void setHandleColor(int i11) {
        this.f36101b = i11;
        ImageView imageView = this.f36108i;
        getContext();
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), C1987R.drawable.fastscroll_handle);
        int i12 = this.f36101b;
        Drawable mutate = drawable.mutate();
        androidx.core.graphics.drawable.a.l(mutate, i12);
        imageView.setImageDrawable(mutate);
    }

    public void setHideScrollbar(boolean z5) {
        int i11;
        this.f36103d = z5;
        View view = this.f36110k;
        if (z5) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        super.setLayoutParams(layoutParams);
    }

    public void setSectionIndexer(d dVar) {
        this.f36104e = dVar;
    }

    public void setTrackColor(int i11) {
        ImageView imageView = this.f36109j;
        getContext();
        Drawable mutate = androidx.core.content.a.getDrawable(getContext(), C1987R.drawable.fastscroll_track).mutate();
        androidx.core.graphics.drawable.a.l(mutate, i11);
        imageView.setImageDrawable(mutate);
    }

    public void setTrackVisible(boolean z5) {
        int i11;
        ImageView imageView = this.f36109j;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public FastScroller(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes;
        this.f36111l = new a();
        new b();
        View.inflate(context, C1987R.layout.fastscroller, this);
        boolean z5 = false;
        setClipChildren(false);
        setOrientation(0);
        this.f36107h = (TextView) findViewById(C1987R.id.fastscroll_bubble);
        this.f36108i = (ImageView) findViewById(C1987R.id.fastscroll_handle);
        this.f36109j = (ImageView) findViewById(C1987R.id.fastscroll_track);
        this.f36110k = findViewById(C1987R.id.fastscroll_scrollbar);
        int i12 = -7829368;
        int i13 = -12303292;
        int i14 = -3355444;
        int i15 = -1;
        boolean z11 = true;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, in.a.f72606h, 0, 0)) != null) {
            try {
                i12 = obtainStyledAttributes.getColor(0, -7829368);
                i13 = obtainStyledAttributes.getColor(2, -12303292);
                i14 = obtainStyledAttributes.getColor(5, -3355444);
                i15 = obtainStyledAttributes.getColor(1, -1);
                z5 = obtainStyledAttributes.getBoolean(4, false);
                z11 = obtainStyledAttributes.getBoolean(3, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setTrackColor(i14);
        setHandleColor(i13);
        setBubbleColor(i12);
        setBubbleTextColor(i15);
        setHideScrollbar(z11);
        setTrackVisible(z5);
        setLayoutParams(generateLayoutParams(attributeSet));
        setGravity(8388613);
    }

    public void setLayoutParams(ViewGroup viewGroup) {
        if (!(viewGroup instanceof CoordinatorLayout)) {
            if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                layoutParams.gravity = 8388613;
                setLayoutParams(layoutParams);
                return;
            } else if (viewGroup instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) getLayoutParams();
                layoutParams2.addRule(21);
                setLayoutParams(layoutParams2);
                return;
            } else if (viewGroup instanceof ConstraintLayout) {
                setLayoutParams((ConstraintLayout.LayoutParams) getLayoutParams());
                return;
            } else {
                throw new IllegalArgumentException("Parent ViewGroup must be a CoordinatorLayout, FrameLayout, or RelativeLayout");
            }
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) getLayoutParams();
        throw null;
    }

    private void setRecyclerViewPosition(float f11) {
    }
}
