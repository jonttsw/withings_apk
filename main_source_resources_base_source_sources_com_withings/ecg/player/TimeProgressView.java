package com.withings.ecg.player;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import pm.e;
import wn.d;
/* compiled from: TimeProgressView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/withings/ecg/player/TimeProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "progress", "Lnm0/y;", "setAnimateProgress", "(F)V", "", "duration", "setDuration", "(J)V", "", "isVisible", "setCounterVisibility", "(Z)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TimeProgressView extends ConstraintLayout {
    private int A;
    private boolean B;

    /* renamed from: t  reason: collision with root package name */
    private final e.a f38845t;

    /* renamed from: u  reason: collision with root package name */
    private final ObjectAnimator f38846u;

    /* renamed from: v  reason: collision with root package name */
    private final Handler f38847v;

    /* renamed from: w  reason: collision with root package name */
    private final a f38848w;

    /* renamed from: x  reason: collision with root package name */
    private final Guideline f38849x;

    /* renamed from: y  reason: collision with root package name */
    private final TextView f38850y;

    /* renamed from: z  reason: collision with root package name */
    private int f38851z;

    /* compiled from: TimeProgressView.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TimeProgressView timeProgressView = TimeProgressView.this;
            if (!timeProgressView.B) {
                timeProgressView.C();
                if (timeProgressView.f38851z > 0) {
                    timeProgressView.f38847v.postDelayed(this, 500L);
                } else {
                    timeProgressView.f38847v.removeCallbacks(this);
                }
                timeProgressView.f38851z -= 500;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        e.a aVar = this.f38845t;
        aVar.x();
        aVar.a(true);
        aVar.q();
        aVar.r(1);
        this.f38850y.setText(new e(aVar).a(this.f38851z));
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void setAnimateProgress(float f11) {
        this.f38849x.setGuidelinePercent(f11);
    }

    public static void t(TimeProgressView this$0) {
        u.j(this$0, "this$0");
        this$0.f38851z = this$0.A;
        this$0.C();
        this$0.setAlpha(1.0f);
        this$0.f38849x.setGuidelinePercent(0.0f);
        this$0.f38847v.removeCallbacks(this$0.f38848w);
        this$0.f38846u.cancel();
    }

    public final void A() {
        this.B = false;
        this.f38847v.post(this.f38848w);
        ObjectAnimator objectAnimator = this.f38846u;
        if (objectAnimator.isPaused()) {
            objectAnimator.resume();
        } else {
            objectAnimator.start();
        }
    }

    public final void B() {
        this.B = true;
        animate().alpha(0.0f).setDuration(250L).withEndAction(new d(this, 2));
    }

    public final void setCounterVisibility(boolean z5) {
        int i11;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        this.f38850y.setVisibility(i11);
    }

    public final void setDuration(long j5) {
        int i11 = (int) j5;
        this.f38851z = i11;
        this.A = i11;
        C();
        this.f38846u.setDuration(j5);
    }

    public final void z() {
        this.B = true;
        this.f38846u.pause();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f38845t = new e.a(context, 0);
        this.f38847v = new Handler();
        this.f38848w = new a();
        View inflate = LayoutInflater.from(context).inflate(C1987R.layout.heart_sound_time_progress_view, this);
        View findViewById = inflate.findViewById(C1987R.id.progress_view_guideline);
        u.i(findViewById, "findViewById(...)");
        this.f38849x = (Guideline) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.progress_view_counter);
        u.i(findViewById2, "findViewById(...)");
        this.f38850y = (TextView) findViewById2;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.l(bVar);
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.l(bVar);
        bVar2.n(C1987R.id.progress_view, 2, 0, 2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animateProgress", 0.0f, 1.0f);
        u.i(ofFloat, "ofFloat(...)");
        this.f38846u = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
    }
}
