package com.withings.wiscale2.measure.accountmeasure.ui;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import dp0.h;
import java.text.NumberFormat;
import k70.b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import l70.u;
import l70.v;
import l70.w;
import nm0.l;
import nm0.y;
import qm0.d;
import tb0.g4;
import ym0.p;
/* compiled from: HeightView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0005\u0010\u001c¨\u0006$"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/HeightView;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/MeasureView;", "", "valueInMeter", "Lnm0/y;", "setValue", "(D)V", "Ltb0/g4;", "j", "Ltb0/g4;", "getBinding", "()Ltb0/g4;", "setBinding", "(Ltb0/g4;)V", "binding", "getHeightValueInMeter", "()D", "heightValueInMeter", "Ll70/u;", HealthConstants.FoodIntake.UNIT, "getUnit", "()Ll70/u;", "setUnit", "(Ll70/u;)V", "Lcom/withings/library/measure/Measure;", "value", "getValue", "()Lcom/withings/library/measure/Measure;", "(Lcom/withings/library/measure/Measure;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HeightView extends MeasureView {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f58077l = 0;

    /* renamed from: j  reason: collision with root package name */
    public g4 f58078j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f58079k;

    /* compiled from: HeightView.kt */
    /* loaded from: classes5.dex */
    public final class a implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        private final double f58080a;

        public a(double d11) {
            this.f58080a = d11;
        }

        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence source, int i11, int i12, Spanned dest, int i13, int i14) {
            u.j(source, "source");
            u.j(dest, "dest");
            try {
                String substring = dest.toString().substring(0, i13);
                u.i(substring, "substring(...)");
                String substring2 = dest.toString().substring(i14, dest.toString().length());
                u.i(substring2, "substring(...)");
                String concat = substring.concat(substring2);
                String substring3 = concat.substring(0, i13);
                u.i(substring3, "substring(...)");
                String substring4 = concat.substring(i13, concat.length());
                u.i(substring4, "substring(...)");
                double parseDouble = Double.parseDouble(substring3 + ((Object) source) + substring4);
                double d11 = this.f58080a;
                if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= parseDouble && parseDouble <= d11) {
                        return null;
                    }
                    return "";
                } else if (d11 <= parseDouble && parseDouble <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    return null;
                } else {
                    return "";
                }
            } catch (NumberFormatException e11) {
                e11.printStackTrace();
                return "";
            }
        }
    }

    /* compiled from: HeightView.kt */
    @e(c = "com.withings.wiscale2.measure.accountmeasure.ui.HeightView$unitPreferences$1", f = "HeightView.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<CoroutineScope, d<? super v>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58081a;

        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super v> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58081a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                w a11 = w.a.a();
                this.f58081a = 1;
                obj = FlowKt.first(a11.get(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    public HeightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object runBlocking$default;
        u.g(context);
        getBinding().f99121a.setOnTouchListener(new View.OnTouchListener() { // from class: com.withings.wiscale2.measure.accountmeasure.ui.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i11 = HeightView.f58077l;
                HeightView this$0 = HeightView.this;
                u.j(this$0, "this$0");
                this$0.getBinding().f99121a.requestFocus();
                Object systemService = this$0.getContext().getSystemService("input_method");
                u.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return ((InputMethodManager) systemService).showSoftInput(this$0.getBinding().f99121a, 0);
            }
        });
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new i(2, null), 1, null);
        int c11 = ((v) runBlocking$default).c();
        this.f58079k = c11 == 7;
        setType(4);
        l70.u.f78815b.getClass();
        setUnit(u.a.c(c11));
    }

    private final double getHeightValueInMeter() {
        Integer valueOf;
        int i11;
        boolean z5;
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            if (!TextUtils.isEmpty(getBinding().f99124d.getText())) {
                String d12 = new h(",").d(getBinding().f99124d.getText().toString(), ".");
                int length = d12.length() - 1;
                int i12 = 0;
                boolean z11 = false;
                while (i12 <= length) {
                    if (!z11) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (kotlin.jvm.internal.u.l(d12.charAt(i11), 32) <= 0) {
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
                d11 = Double.parseDouble(d12.subSequence(i12, length + 1).toString());
            }
        } catch (NumberFormatException unused) {
        }
        if (!this.f58079k) {
            int i13 = k70.a.f75659c;
            return d11 / 100.0d;
        }
        if (TextUtils.isEmpty(getBinding().f99121a.getText())) {
            valueOf = 0;
        } else {
            valueOf = Integer.valueOf(getBinding().f99121a.getText().toString());
        }
        int i14 = k70.b.f75660c;
        return ((((long) d11) * 12) + valueOf.intValue()) * 0.0254d;
    }

    private final void i() {
        if (this.f58079k) {
            getBinding().f99121a.setImeOptions(getImeActionType());
            getBinding().f99121a.setFilters(new InputFilter[]{new a(11.0d)});
            getBinding().f99124d.setFilters(new InputFilter[]{new a(8.0d)});
            return;
        }
        getBinding().f99124d.setFilters(new InputFilter[]{new a(300.0d)});
    }

    private final void k(int i11) {
        ViewGroup.LayoutParams layoutParams = getBinding().f99123c.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = getBinding().f99122b.getLayoutParams();
        if (i11 != 6) {
            if (i11 == 7) {
                layoutParams.width = -2;
                getBinding().f99123c.setLayoutParams(layoutParams);
                layoutParams2.width = -1;
                getBinding().f99122b.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        layoutParams.width = -1;
        getBinding().f99123c.setLayoutParams(layoutParams);
        layoutParams2.width = -2;
        getBinding().f99122b.setLayoutParams(layoutParams2);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    protected final void c(Context context) {
        setBinding(g4.a(LayoutInflater.from(context), this));
    }

    public final g4 getBinding() {
        g4 g4Var = this.f58078j;
        if (g4Var != null) {
            return g4Var;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public l70.u getUnit() {
        return super.getUnit();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public Measure getValue() {
        Measure measure = new Measure();
        measure.setType(4);
        measure.setUnit(-2);
        measure.f95794y = getHeightValueInMeter();
        measure.setValue(getHeightValueInMeter() * 100);
        return measure;
    }

    public final void j(int i11) {
        String f11;
        if (i11 != 6) {
            if (i11 == 7) {
                getBinding().f99123c.setText(getContext().getString(C1987R.string._FEET_SIGN_));
                TextView unit = getBinding().f99123c;
                kotlin.jvm.internal.u.i(unit, "unit");
                unit.setVisibility(0);
                getBinding().f99122b.setText(getContext().getString(C1987R.string._INCH_SIGN_));
                TextView inchUnit = getBinding().f99122b;
                kotlin.jvm.internal.u.i(inchUnit, "inchUnit");
                inchUnit.setVisibility(0);
                EditText inch = getBinding().f99121a;
                kotlin.jvm.internal.u.i(inch, "inch");
                inch.setVisibility(0);
                this.f58079k = true;
                i();
                k(7);
                if (getHeightValueInMeter() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    getBinding().f99124d.setText("");
                    getBinding().f99121a.setText("");
                    return;
                }
                int i12 = k70.b.f75660c;
                b.C1165b a11 = b.a.a(getHeightValueInMeter());
                getBinding().f99124d.setText(String.valueOf(a11.f75661a));
                getBinding().f99121a.setText(String.valueOf(a11.f75662b));
                return;
            }
            return;
        }
        if (getHeightValueInMeter() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            f11 = "";
        } else {
            l70.u.f78815b.getClass();
            l70.u c11 = u.a.c(i11);
            Context context = getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            f11 = c11.f(context, getHeightValueInMeter());
        }
        EditText inch2 = getBinding().f99121a;
        kotlin.jvm.internal.u.i(inch2, "inch");
        inch2.setVisibility(8);
        TextView inchUnit2 = getBinding().f99122b;
        kotlin.jvm.internal.u.i(inchUnit2, "inchUnit");
        inchUnit2.setVisibility(8);
        this.f58079k = false;
        i();
        getBinding().f99124d.setText(f11);
        getBinding().f99123c.setText("");
        k(6);
    }

    public final void setBinding(g4 g4Var) {
        kotlin.jvm.internal.u.j(g4Var, "<set-?>");
        this.f58078j = g4Var;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setUnit(l70.u uVar) {
        int i11;
        super.setUnit(uVar);
        EditText inch = getBinding().f99121a;
        kotlin.jvm.internal.u.i(inch, "inch");
        int i12 = 8;
        if (this.f58079k) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        inch.setVisibility(i11);
        TextView inchUnit = getBinding().f99122b;
        kotlin.jvm.internal.u.i(inchUnit, "inchUnit");
        if (this.f58079k) {
            i12 = 0;
        }
        inchUnit.setVisibility(i12);
        if (this.f58079k) {
            getBinding().f99122b.setText(getContext().getString(C1987R.string._INCH_SIGN_));
            getBinding().f99123c.setText(getContext().getString(C1987R.string._FEET_SIGN_));
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setValue(Measure value) {
        kotlin.jvm.internal.u.j(value, "value");
        super.setValue(value);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setValue(double d11) {
        if (!this.f58079k) {
            super.setValue(d11);
            return;
        }
        int i11 = k70.b.f75660c;
        b.C1165b a11 = b.a.a(d11);
        getBinding().f99124d.setText(NumberFormat.getNumberInstance().format(a11.f75661a));
        getBinding().f99121a.setText(NumberFormat.getNumberInstance().format(a11.f75662b));
    }
}
