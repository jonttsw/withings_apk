package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.withings.common.compose.picker.BirthDateValidator;
import com.withings.library.measure.MeasuresGroup;
import com.withings.views.view.TitleLineLayout;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.accountmeasure.ui.add.h0;
import java.util.Locale;
import javax.inject.Inject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
/* compiled from: AddMeasureManuallyFragment.kt */
/* loaded from: classes5.dex */
public abstract class j0 extends j1 {

    /* renamed from: q  reason: collision with root package name */
    private TextView f58201q;

    /* renamed from: r  reason: collision with root package name */
    private EditText f58202r;

    /* renamed from: s  reason: collision with root package name */
    private TitleLineLayout f58203s;
    @Inject

    /* renamed from: t  reason: collision with root package name */
    public zx.r f58204t;
    @Inject

    /* renamed from: u  reason: collision with root package name */
    public fy.v f58205u;
    @Inject

    /* renamed from: v  reason: collision with root package name */
    public oi0.b f58206v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddMeasureManuallyFragment.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.s implements ym0.l<Long, nm0.y> {
        a(Object obj) {
            super(1, obj, j0.class, "onDateSelected", "onDateSelected(J)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(Long l5) {
            j0.B1((j0) this.receiver, l5.longValue());
            return nm0.y.f85009a;
        }
    }

    public static void A1(j0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.E1();
    }

    public static final void B1(j0 j0Var, long j5) {
        j0Var.getClass();
        j0Var.f58182f = new DateTime(j5, DateTimeZone.getDefault());
        TextView textView = j0Var.f58201q;
        if (textView != null) {
            textView.setText(j0Var.D1());
        }
        FragmentManager parentFragmentManager = j0Var.getParentFragmentManager();
        kotlin.jvm.internal.u.i(parentFragmentManager, "getParentFragmentManager(...)");
        uk.c.b(parentFragmentManager, j0Var.u1().getHourOfDay(), j0Var.u1().getMinuteOfHour(), DateFormat.is24HourFormat(j0Var.getActivity()), new k0(j0Var));
    }

    public static final void C1(j0 j0Var, int i11, int i12) {
        DateTime withMinuteOfHour = j0Var.u1().withHourOfDay(i11).withMinuteOfHour(i12);
        kotlin.jvm.internal.u.i(withMinuteOfHour, "withMinuteOfHour(...)");
        j0Var.f58182f = withMinuteOfHour;
        TextView textView = j0Var.f58201q;
        if (textView != null) {
            String abstractInstant = j0Var.u1().toString(DateTimeFormat.mediumDateTime());
            kotlin.jvm.internal.u.i(abstractInstant, "toString(...)");
            textView.setText(abstractInstant);
        }
    }

    private final String D1() {
        String abstractInstant = new DateTime(u1().getMillis(), DateTimeZone.getDefault()).toString(DateTimeFormat.mediumDateTime().withLocale(Locale.getDefault()));
        kotlin.jvm.internal.u.i(abstractInstant, "toString(...)");
        return abstractInstant;
    }

    private final void E1() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        long millis = u1().getMillis();
        a aVar = new a(this);
        BirthDateValidator birthDateValidator = new BirthDateValidator();
        kotlin.jvm.internal.u.g(parentFragmentManager);
        uk.c.a(parentFragmentManager, 0, millis, 0L, 0L, birthDateValidator, aVar, 13);
    }

    public static void z1(j0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.E1();
    }

    public void F1() {
        Editable editable;
        int i11;
        boolean z5;
        y1(true);
        MeasuresGroup s12 = s1();
        s12.setDevtype(0);
        s12.setAttrib(2);
        s12.setCategory(1);
        EditText editText = this.f58202r;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        int length = valueOf.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            if (!z11) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (kotlin.jvm.internal.u.l(valueOf.charAt(i11), 32) <= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z11) {
                if (!z5) {
                    z11 = true;
                } else {
                    i12++;
                }
            } else if (!z5) {
                break;
            } else {
                length--;
            }
        }
        s12.setComment(valueOf.subSequence(i12, length + 1).toString());
        s12.setUserId(getUser().q());
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new m0(this, s12, null), 3, null);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j1, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        requireActivity().getWindow().setSoftInputMode(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.add_measure, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_save && !x1()) {
            if (w1()) {
                F1();
            }
            return true;
        } else if (item.getItemId() == 16908332) {
            h0.a t12 = t1();
            kotlin.jvm.internal.u.g(t12);
            t12.onCancel();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f58201q = (TextView) view.findViewById(C1987R.id.date_value);
        this.f58202r = (EditText) view.findViewById(C1987R.id.comment_value);
        this.f58203s = (TitleLineLayout) view.findViewById(C1987R.id.date_container);
        TextView textView = this.f58201q;
        if (textView != null) {
            textView.setText(D1());
        }
        TitleLineLayout titleLineLayout = this.f58203s;
        if (titleLineLayout != null) {
            titleLineLayout.setOnClickListener(new sg.b(this, 18));
        }
        TextView textView2 = this.f58201q;
        if (textView2 != null) {
            textView2.setOnClickListener(new sg.c(this, 15));
        }
    }
}
