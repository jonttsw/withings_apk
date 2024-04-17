package com.withings.wiscale2.measure.accountmeasure.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import dp0.j;
import java.text.NumberFormat;
import jm.a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import l70.t;
import l70.u;
import l70.v;
import l70.w;
import nm0.l;
import nm0.y;
import qm0.d;
import sg.f;
import tb0.j4;
import ym0.p;
/* compiled from: WeightView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0005\u0010\u001f¨\u0006&"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/WeightView;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/MeasureView;", "", "value", "Lnm0/y;", "setValue", "(D)V", "Ltb0/j4;", "j", "Ltb0/j4;", "getBinding", "()Ltb0/j4;", "setBinding", "(Ltb0/j4;)V", "binding", "getWeight", "()D", "weight", "", "getAccountWeightUnit", "()I", "accountWeightUnit", "Ll70/u;", HealthConstants.FoodIntake.UNIT, "getUnit", "()Ll70/u;", "setUnit", "(Ll70/u;)V", "Lcom/withings/library/measure/Measure;", "getValue", "()Lcom/withings/library/measure/Measure;", "(Lcom/withings/library/measure/Measure;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class WeightView extends MeasureView {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f58094k = 0;

    /* renamed from: j  reason: collision with root package name */
    public j4 f58095j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeightView.kt */
    @e(c = "com.withings.wiscale2.measure.accountmeasure.ui.WeightView$accountWeightUnit$unitPreferences$1", f = "WeightView.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends i implements p<CoroutineScope, d<? super v>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58096a;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super v> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58096a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                w a11 = w.a.a();
                this.f58096a = 1;
                obj = FlowKt.first(a11.get(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.j(context, "context");
        setType(1);
        u.a aVar = l70.u.f78815b;
        int accountWeightUnit = getAccountWeightUnit();
        aVar.getClass();
        setUnit(u.a.f(accountWeightUnit));
        getBinding().f99250b.setOnClickListener(new f(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    private final int getAccountWeightUnit() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new i(2, null), 1, null);
        return ((v) runBlocking$default).e();
    }

    private final double getWeight() {
        try {
            double parseDouble = Double.parseDouble(j.O(getBinding().f99252d.getText().toString(), ",", ".", false));
            Context context = getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            int j5 = a.d.a(context).g(1).j();
            if (j5 != 2) {
                if (j5 == 14) {
                    try {
                        int parseInt = Integer.parseInt(getBinding().f99249a.getText().toString());
                        int i11 = t.f78812e;
                        return t.a.b(parseInt, parseDouble);
                    } catch (NumberFormatException unused) {
                        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    }
                }
                return parseDouble;
            }
            int i12 = k70.f.f75665c;
            return parseDouble * 0.453592d;
        } catch (NumberFormatException unused2) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    protected final void c(Context context) {
        setBinding(j4.a(LayoutInflater.from(context), this));
    }

    public final j4 getBinding() {
        j4 j4Var = this.f58095j;
        if (j4Var != null) {
            return j4Var;
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
        measure.setType(getType());
        measure.setUnit(-4);
        measure.setValue(an0.a.a(getWeight() * 10000));
        return measure;
    }

    public final void i(int i11) {
        String f11;
        getBinding().f99252d.setImeOptions(getImeActionType());
        double weight = getWeight();
        if (i11 != 1 && i11 != 2) {
            if (i11 == 14) {
                getBinding().f99251c.setText("");
                getBinding().f99250b.setText(getContext().getString(C1987R.string._STONE_SIGN_));
                TextView stoneUnit = getBinding().f99250b;
                kotlin.jvm.internal.u.i(stoneUnit, "stoneUnit");
                stoneUnit.setVisibility(0);
                EditText stone = getBinding().f99249a;
                kotlin.jvm.internal.u.i(stone, "stone");
                stone.setVisibility(0);
                if (weight < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    getBinding().f99252d.setText("");
                    getBinding().f99249a.setText("");
                    return;
                }
                int i12 = t.f78812e;
                l70.y a11 = t.a.a(weight);
                getBinding().f99249a.setText(String.valueOf(a11.f78868a));
                NumberFormat numberInstance = NumberFormat.getNumberInstance();
                numberInstance.setMaximumFractionDigits(1);
                numberInstance.setMinimumFractionDigits(0);
                getBinding().f99252d.setText(numberInstance.format(a11.f78869b));
                return;
            }
            return;
        }
        EditText editText = getBinding().f99252d;
        if (weight <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            f11 = "";
        } else {
            l70.u.f78815b.getClass();
            l70.u f12 = u.a.f(i11);
            Context context = getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            f11 = f12.f(context, weight);
        }
        editText.setText(f11);
        getBinding().f99251c.setText("");
        TextView stoneUnit2 = getBinding().f99250b;
        kotlin.jvm.internal.u.i(stoneUnit2, "stoneUnit");
        stoneUnit2.setVisibility(8);
        EditText stone2 = getBinding().f99249a;
        kotlin.jvm.internal.u.i(stone2, "stone");
        stone2.setVisibility(8);
    }

    public final void setBinding(j4 j4Var) {
        kotlin.jvm.internal.u.j(j4Var, "<set-?>");
        this.f58095j = j4Var;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setUnit(l70.u uVar) {
        int i11;
        boolean z5;
        int i12;
        super.setUnit(uVar);
        int accountWeightUnit = getAccountWeightUnit();
        TextView textView = getBinding().f99251c;
        boolean z11 = true;
        if (accountWeightUnit == 1) {
            i11 = C1987R.string._KG_;
        } else {
            i11 = C1987R.string._LB_;
        }
        textView.setText(i11);
        EditText stone = getBinding().f99249a;
        kotlin.jvm.internal.u.i(stone, "stone");
        int i13 = 0;
        if (accountWeightUnit == 14) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        stone.setVisibility(i12);
        TextView stoneUnit = getBinding().f99250b;
        kotlin.jvm.internal.u.i(stoneUnit, "stoneUnit");
        if (accountWeightUnit != 14) {
            z11 = false;
        }
        if (!z11) {
            i13 = 8;
        }
        stoneUnit.setVisibility(i13);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setValue(Measure value) {
        kotlin.jvm.internal.u.j(value, "value");
        super.setValue(value);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.MeasureView
    public void setValue(double d11) {
        int accountWeightUnit = getAccountWeightUnit();
        if (accountWeightUnit == 1 || accountWeightUnit == 2) {
            EditText editText = getBinding().f99252d;
            Context context = getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            editText.setText(a.d.a(context).b(d11, accountWeightUnit));
            getBinding().f99249a.setText("");
        } else if (accountWeightUnit != 14) {
        } else {
            int i11 = t.f78812e;
            l70.y a11 = t.a.a(d11);
            getBinding().f99252d.setText(NumberFormat.getNumberInstance().format(a11.f78869b));
            getBinding().f99249a.setText(NumberFormat.getNumberInstance().format(a11.f78868a));
        }
    }
}
