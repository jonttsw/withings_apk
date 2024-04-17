package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: ScoreWeeklyView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\"\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R#\u0010'\u001a\n \u0018*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/ScoreWeeklyView;", "Landroid/widget/LinearLayout;", "", "title", "Lnm0/y;", "setDay", "(I)V", "", "(Ljava/lang/String;)V", "", "visible", "setPlaceHolderVisible", "(Z)V", "Lcom/withings/wiscale2/sleep/ui/sleepscore/ScoreWeeklyView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lcom/withings/wiscale2/sleep/ui/sleepscore/ScoreWeeklyView$a;)V", "Landroid/util/AttributeSet;", "a", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lnm0/g;", "getDayText", "()Landroid/widget/TextView;", "dayText", "Landroidx/compose/ui/platform/ComposeView;", "c", "getGoalRingView", "()Landroidx/compose/ui/platform/ComposeView;", "goalRingView", "Landroid/view/View;", "d", "getPlaceHolder", "()Landroid/view/View;", "placeHolder", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScoreWeeklyView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final AttributeSet f60518a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f60519b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f60520c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f60521d;

    /* renamed from: e  reason: collision with root package name */
    private a f60522e;

    /* renamed from: f  reason: collision with root package name */
    private DateTime f60523f;

    /* compiled from: ScoreWeeklyView.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void Y0(DateTime dateTime);
    }

    /* compiled from: ScoreWeeklyView.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) ScoreWeeklyView.this.findViewById(C1987R.id.day);
        }
    }

    /* compiled from: ScoreWeeklyView.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            return (ComposeView) ScoreWeeklyView.this.findViewById(C1987R.id.ring_view);
        }
    }

    /* compiled from: ScoreWeeklyView.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<View> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return ScoreWeeklyView.this.findViewById(C1987R.id.place_holder);
        }
    }

    /* compiled from: ScoreWeeklyView.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f60528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f60529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, int i12) {
            super(2);
            this.f60528b = i11;
            this.f60529c = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 164000233, new q(ScoreWeeklyView.this, this.f60528b, this.f60529c)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScoreWeeklyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public static void a(ScoreWeeklyView this$0, DateTime dayDate) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(dayDate, "$dayDate");
        a aVar = this$0.f60522e;
        if (aVar != null) {
            aVar.Y0(dayDate);
        }
    }

    private final TextView getDayText() {
        return (TextView) this.f60519b.getValue();
    }

    private final ComposeView getGoalRingView() {
        return (ComposeView) this.f60520c.getValue();
    }

    private final View getPlaceHolder() {
        return (View) this.f60521d.getValue();
    }

    public final void b(DateTime dateTime) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.u.h(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        setLayoutParams(layoutParams2);
        setOrientation(1);
        this.f60523f = dateTime;
    }

    public final void c(int i11, int i12) {
        getGoalRingView().setContent(new s1.a(true, 1467152835, new e(i12, i11)));
        setPlaceHolderVisible(false);
    }

    public final AttributeSet getAttrs() {
        return this.f60518a;
    }

    public final void setDay(int i11) {
        getDayText().setText(i11);
    }

    public final void setOnClickListener(a aVar) {
        boolean z5;
        this.f60522e = aVar;
        if (aVar != null && this.f60523f != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        getRootView().setClickable(z5);
        getRootView().setFocusableInTouchMode(z5);
        getRootView().setFocusable(z5);
        DateTime dateTime = this.f60523f;
        if (dateTime != null) {
            setOnClickListener(new za0.b(5, this, dateTime));
        }
    }

    public final void setPlaceHolderVisible(boolean z5) {
        int i11;
        View placeHolder = getPlaceHolder();
        kotlin.jvm.internal.u.i(placeHolder, "<get-placeHolder>(...)");
        int i12 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        placeHolder.setVisibility(i11);
        ComposeView goalRingView = getGoalRingView();
        kotlin.jvm.internal.u.i(goalRingView, "<get-goalRingView>(...)");
        if (!z5) {
            i12 = 0;
        }
        goalRingView.setVisibility(i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreWeeklyView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f60518a = attributeSet;
        this.f60519b = nm0.h.b(new b());
        this.f60520c = nm0.h.b(new c());
        this.f60521d = nm0.h.b(new d());
        LayoutInflater.from(getContext()).inflate(C1987R.layout.view_score_weekly, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.withings.wiscale2.n2.f58724d);
        kotlin.jvm.internal.u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        setDay(string);
        setPlaceHolderVisible(true);
    }

    public final void setDay(String str) {
        getDayText().setText(str);
    }
}
