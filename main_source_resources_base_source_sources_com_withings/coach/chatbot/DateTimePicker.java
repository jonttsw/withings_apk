package com.withings.coach.chatbot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: DateTimePicker.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/withings/coach/chatbot/DateTimePicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/DatePicker$OnDateChangedListener;", "Landroid/widget/TimePicker$OnTimeChangedListener;", "Landroid/widget/TimePicker;", "t", "Lnm0/g;", "getTimePicker", "()Landroid/widget/TimePicker;", "timePicker", "Landroid/widget/DatePicker;", "u", "getDatePicker", "()Landroid/widget/DatePicker;", "datePicker", "Landroid/widget/Button;", ConstantsWs.JSON_SESSION_KEY_VALUE, "getNextButton", "()Landroid/widget/Button;", "nextButton", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DateTimePicker extends ConstraintLayout implements DatePicker.OnDateChangedListener, TimePicker.OnTimeChangedListener {

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f32953t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f32954u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f32955v;

    /* renamed from: w  reason: collision with root package name */
    private DateTime f32956w;

    /* compiled from: DateTimePicker.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<DatePicker> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final DatePicker invoke() {
            return (DatePicker) DateTimePicker.this.findViewById(C1987R.id.date_picker);
        }
    }

    /* compiled from: DateTimePicker.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Button> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) DateTimePicker.this.findViewById(C1987R.id.next);
        }
    }

    /* compiled from: DateTimePicker.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<TimePicker> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TimePicker invoke() {
            return (TimePicker) DateTimePicker.this.findViewById(C1987R.id.time_picker);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    private final DatePicker getDatePicker() {
        Object value = this.f32954u.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (DatePicker) value;
    }

    private final Button getNextButton() {
        Object value = this.f32955v.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (Button) value;
    }

    private final TimePicker getTimePicker() {
        Object value = this.f32953t.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (TimePicker) value;
    }

    public static void t(DateTimePicker this$0, ym0.l newDateListener) {
        kotlin.jvm.internal.u.j(newDateListener, "$newDateListener");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        newDateListener.invoke(this$0.f32956w);
    }

    public static void u(DateTimePicker this$0, ym0.l newDateTimeListener) {
        kotlin.jvm.internal.u.j(newDateTimeListener, "$newDateTimeListener");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        newDateTimeListener.invoke(this$0.f32956w);
    }

    public static void v(DateTimePicker this$0, ym0.l newTimeListener) {
        kotlin.jvm.internal.u.j(newTimeListener, "$newTimeListener");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        newTimeListener.invoke(this$0.f32956w);
    }

    public static void w(DateTimePicker this$0, ym0.l newDateTimeListener) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(newDateTimeListener, "$newDateTimeListener");
        this$0.getDatePicker().setVisibility(8);
        this$0.getTimePicker().setVisibility(0);
        this$0.getNextButton().setOnClickListener(new a1(0, newDateTimeListener, this$0));
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i11, int i12, int i13) {
        DateTime withDate = this.f32956w.withDate(i11, i12 + 1, i13);
        kotlin.jvm.internal.u.i(withDate, "withDate(...)");
        this.f32956w = withDate;
    }

    @Override // android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i11, int i12) {
        DateTime withTime = this.f32956w.withTime(i11, i12, 0, 0);
        kotlin.jvm.internal.u.i(withTime, "withTime(...)");
        this.f32956w = withTime;
    }

    public final void x(ym0.l<? super DateTime, nm0.y> lVar) {
        getDatePicker().setVisibility(0);
        getTimePicker().setVisibility(8);
        getNextButton().setOnClickListener(new z0(0, lVar, this));
    }

    public final void y(ym0.l<? super DateTime, nm0.y> lVar) {
        getDatePicker().setVisibility(0);
        getTimePicker().setVisibility(8);
        getNextButton().setOnClickListener(new y0(0, this, lVar));
    }

    public final void z(ym0.l<? super DateTime, nm0.y> lVar) {
        getDatePicker().setVisibility(8);
        getTimePicker().setVisibility(0);
        getNextButton().setOnClickListener(new sg.a(1, lVar, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimePicker(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f32953t = nm0.h.b(new c());
        this.f32954u = nm0.h.b(new a());
        this.f32955v = nm0.h.b(new b());
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        this.f32956w = now;
        View.inflate(context, C1987R.layout.view_date_time_picker, this);
        ay.b.n(this, true, false, 29);
        getDatePicker().init(this.f32956w.getYear(), this.f32956w.getMonthOfYear(), this.f32956w.getDayOfMonth(), this);
        getTimePicker().setOnTimeChangedListener(this);
    }
}
