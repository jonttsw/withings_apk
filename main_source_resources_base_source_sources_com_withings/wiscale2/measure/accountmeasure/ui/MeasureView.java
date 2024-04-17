package com.withings.wiscale2.measure.accountmeasure.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.s2;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.feature.dynamic.e.e;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.n2;
import dp0.j;
import je0.c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import l70.u;
import l70.v;
import l70.w;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: MeasureView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010C\u001a\u00020\u0017¢\u0006\u0004\bD\u0010EJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010-\u001a\u0004\u0018\u00010&2\b\u0010\u0003\u001a\u0004\u0018\u00010&8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\"\u00105\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR$\u0010\u0003\u001a\u0002062\u0006\u00107\u001a\u0002068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b\u0005\u0010:R\u0014\u0010<\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010>\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u00109¨\u0006G"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/MeasureView;", "Landroid/widget/LinearLayout;", "", "value", "Lnm0/y;", "setValue", "(D)V", "Landroid/widget/EditText;", "a", "Landroid/widget/EditText;", "getValueView", "()Landroid/widget/EditText;", "setValueView", "(Landroid/widget/EditText;)V", "valueView", "Lcom/google/android/material/textview/MaterialTextView;", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lcom/google/android/material/textview/MaterialTextView;", "getUnitView", "()Lcom/google/android/material/textview/MaterialTextView;", "setUnitView", "(Lcom/google/android/material/textview/MaterialTextView;)V", "unitView", "", "c", "I", "getType", "()I", "setType", "(I)V", "type", "", "d", "Z", "isUnitVisible", "()Z", "setUnitVisible", "(Z)V", "Ll70/u;", e.f28630a, "Ll70/u;", "getUnit", "()Ll70/u;", "setUnit", "(Ll70/u;)V", HealthConstants.FoodIntake.UNIT, "f", "getValueColor", "setValueColor", "valueColor", ConstantsWs.JSON_SESSION_KEY_GCONST, "getImeActionType", "setImeActionType", "imeActionType", "Lcom/withings/library/measure/Measure;", "measure", "getValue", "()Lcom/withings/library/measure/Measure;", "(Lcom/withings/library/measure/Measure;)V", "getDoubleValue", "doubleValue", "getIntValue", "intValue", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SavedState", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MeasureView extends LinearLayout {

    /* renamed from: i  reason: collision with root package name */
    private static final char[] f58082i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ','};

    /* renamed from: a  reason: collision with root package name */
    private EditText f58083a;

    /* renamed from: b  reason: collision with root package name */
    private MaterialTextView f58084b;

    /* renamed from: c  reason: collision with root package name */
    private int f58085c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58086d;

    /* renamed from: e  reason: collision with root package name */
    private u f58087e;

    /* renamed from: f  reason: collision with root package name */
    private int f58088f;

    /* renamed from: g  reason: collision with root package name */
    private int f58089g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58090h;

    /* compiled from: MeasureView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/MeasureView$SavedState;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    private static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        private Parcelable f58091a;

        /* renamed from: b  reason: collision with root package name */
        private String f58092b;

        /* compiled from: MeasureView.kt */
        /* loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.u.j(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable, String str) {
            this.f58091a = parcelable;
            this.f58092b = str;
        }

        public final Parcelable a() {
            return this.f58091a;
        }

        public final String b() {
            return this.f58092b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.u.j(out, "out");
            out.writeParcelable(this.f58091a, i11);
            out.writeString(this.f58092b);
        }
    }

    /* compiled from: MeasureView.kt */
    /* loaded from: classes5.dex */
    public static final class a extends NumberKeyListener {
        @Override // android.text.method.NumberKeyListener
        protected final char[] getAcceptedChars() {
            return MeasureView.f58082i;
        }

        @Override // android.text.method.KeyListener
        public final int getInputType() {
            return 8194;
        }
    }

    /* compiled from: MeasureView.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.MeasureView$heightUnit$1", f = "MeasureView.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<CoroutineScope, d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58093a;

        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super Integer> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58093a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                w a11 = w.a.a();
                this.f58093a = 1;
                obj = FlowKt.first(a11.get(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new Integer(((v) obj).c());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeasureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public static void a(MeasureView this$0, Context context) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(context, "$context");
        this$0.f58083a.requestFocus();
        Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.u.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this$0.f58083a, 0);
    }

    private final Measure getDoubleValue() {
        double d11;
        try {
            d11 = Double.parseDouble(j.O(this.f58083a.getText().toString(), ",", ".", false));
        } catch (NumberFormatException e11) {
            x70.b.e(this, e11);
            d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        Measure measure = new Measure();
        measure.setType(this.f58085c);
        measure.setUnit(-3);
        measure.setValue(an0.a.a(d11 * 1000));
        return measure;
    }

    private final Measure getIntValue() {
        double d11;
        try {
            d11 = Double.parseDouble(j.O(this.f58083a.getText().toString(), ",", ".", false));
        } catch (NumberFormatException e11) {
            x70.b.e(this, e11);
            d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        Measure measure = new Measure();
        measure.setType(this.f58085c);
        measure.setUnit(0);
        measure.setValue(d11);
        return measure;
    }

    protected void c(Context context) {
        LayoutInflater.from(context).inflate(C1987R.layout.view_measure, this);
        int i11 = C1987R.id.unit;
        if (((TextView) s2.g(this, C1987R.id.unit)) != null) {
            i11 = C1987R.id.value;
            if (((EditText) s2.g(this, C1987R.id.value)) != null) {
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i11)));
    }

    public final void d() {
        this.f58083a.setSelectAllOnFocus(true);
        this.f58083a.requestFocus();
        this.f58083a.selectAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        kotlin.jvm.internal.u.j(container, "container");
        super.dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        kotlin.jvm.internal.u.j(container, "container");
        super.dispatchFreezeSelfOnly(container);
    }

    public final void e() {
        this.f58083a.setError(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0 <= 500.0d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r0 <= 999.0d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r0 <= 999.0d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r0 <= 3.0d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
        if (r0 <= 300.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r9 = this;
            com.withings.library.measure.Measure r0 = r9.getValue()
            double r0 = r0.f95794y
            int r2 = r9.f58085c
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 1
            r6 = 0
            if (r2 == r5) goto L4e
            r7 = 4
            if (r2 == r7) goto L3e
            r7 = 4651998512748167168(0x408f380000000000, double:999.0)
            switch(r2) {
                case 9: goto L35;
                case 10: goto L2c;
                case 11: goto L1a;
                default: goto L19;
            }
        L19:
            goto L5b
        L1a:
            r2 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L2a
            r2 = 4647503709213818880(0x407f400000000000, double:500.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L2a
            goto L5b
        L2a:
            r5 = r6
            goto L5b
        L2c:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L2a
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L2a
            goto L5b
        L35:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L2a
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L2a
            goto L5b
        L3e:
            r2 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L2a
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L2a
            goto L5b
        L4e:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L2a
            r2 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L2a
        L5b:
            if (r5 == 0) goto L61
            r9.e()
            goto L64
        L61:
            r9.g()
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.accountmeasure.ui.MeasureView.f():boolean");
    }

    public final void g() {
        EditText editText = this.f58083a;
        editText.setError(editText.getContext().getString(C1987R.string._INCORRECT_MEASURE_));
    }

    public final int getImeActionType() {
        return this.f58089g;
    }

    public final int getType() {
        return this.f58085c;
    }

    public u getUnit() {
        return this.f58087e;
    }

    public final MaterialTextView getUnitView() {
        return this.f58084b;
    }

    public Measure getValue() {
        switch (this.f58085c) {
            case 9:
            case 10:
            case 11:
                return getIntValue();
            default:
                return getDoubleValue();
        }
    }

    public final int getValueColor() {
        return this.f58088f;
    }

    public final EditText getValueView() {
        return this.f58083a;
    }

    public final void h(int i11) {
        String str;
        EditText editText = this.f58083a;
        Context context = editText.getContext();
        if (context != null) {
            str = context.getString(i11);
        } else {
            str = null;
        }
        editText.setError(str);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable state) {
        kotlin.jvm.internal.u.j(state, "state");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.a());
        this.f58083a.setText(savedState.b());
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f58083a.getText().toString());
    }

    public final void setImeActionType(int i11) {
        this.f58089g = i11;
    }

    public final void setType(int i11) {
        this.f58085c = i11;
    }

    public void setUnit(u uVar) {
        String str;
        MaterialTextView materialTextView = this.f58084b;
        if (uVar != null) {
            Context context = getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            str = uVar.h(context);
        } else {
            str = null;
        }
        materialTextView.setText(str);
        this.f58087e = uVar;
    }

    public final void setUnitView(MaterialTextView materialTextView) {
        kotlin.jvm.internal.u.j(materialTextView, "<set-?>");
        this.f58084b = materialTextView;
    }

    public final void setUnitVisible(boolean z5) {
        this.f58086d = z5;
    }

    public void setValue(Measure measure) {
        kotlin.jvm.internal.u.j(measure, "measure");
        setValue(measure.f95794y);
    }

    public final void setValueColor(int i11) {
        this.f58088f = i11;
    }

    public final void setValueView(EditText editText) {
        kotlin.jvm.internal.u.j(editText, "<set-?>");
        this.f58083a = editText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    public MeasureView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Object runBlocking$default;
        kotlin.jvm.internal.u.j(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n2.f58723c);
            kotlin.jvm.internal.u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f58086d = obtainStyledAttributes.getBoolean(2, true);
            this.f58089g = obtainStyledAttributes.getInt(1, 5);
            this.f58090h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        c(context);
        View findViewById = findViewById(C1987R.id.value);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f58083a = (EditText) findViewById;
        View findViewById2 = findViewById(C1987R.id.unit);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        MaterialTextView materialTextView = (MaterialTextView) findViewById2;
        this.f58084b = materialTextView;
        materialTextView.setOnClickListener(new c(3, this, context));
        setOrientation(0);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new i(2, null), 1, null);
        if (((Number) runBlocking$default).intValue() != 7) {
            this.f58084b.setVisibility(this.f58086d ? 0 : 8);
            this.f58083a.setImeOptions(this.f58089g);
        }
        if (this.f58090h) {
            this.f58083a.setInputType(8194);
            this.f58083a.setKeyListener(new NumberKeyListener());
            return;
        }
        this.f58083a.setInputType(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setValue(double r4) {
        /*
            r3 = this;
            l70.u r0 = r3.getUnit()
            if (r0 == 0) goto L15
            android.content.Context r1 = r3.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.u.i(r1, r2)
            java.lang.String r0 = r0.f(r1, r4)
            if (r0 != 0) goto L1d
        L15:
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance()
            java.lang.String r0 = r0.format(r4)
        L1d:
            android.widget.EditText r4 = r3.f58083a
            r4.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.accountmeasure.ui.MeasureView.setValue(double):void");
    }
}
