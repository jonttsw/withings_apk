package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import withings.android.widget.TextViewKt;
/* compiled from: WeightEditText.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\f\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\n \u0015*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR#\u0010\"\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R#\u0010%\u001a\n \u0015*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u001eR#\u0010(\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R#\u0010+\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019R*\u00102\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0007R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/withings/design/view/WeightEditText;", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView$OnEditorActionListener;", "", "resId", "Lnm0/y;", "setTitle", "(I)V", "optionValue", "setImeOption", "Lcom/withings/design/view/WeightEditText$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDoneListener", "(Lcom/withings/design/view/WeightEditText$a;)V", "Lkotlin/Function0;", "(Lym0/a;)V", "", "errorMessage", "setError", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lnm0/g;", "getTitle", "()Landroid/widget/TextView;", "title", "Landroid/widget/EditText;", com.huawei.hms.feature.dynamic.e.b.f28627a, "getWeightEditText", "()Landroid/widget/EditText;", "weightEditText", "c", "getWeightUnitTextView", "weightUnitTextView", "d", "getStonesEditText", "stonesEditText", com.huawei.hms.feature.dynamic.e.e.f28630a, "getStonesUnitTextView", "stonesUnitTextView", "f", "getWeightError", "weightError", "<set-?>", ConstantsWs.JSON_SESSION_KEY_GCONST, "I", "getUnit", "()I", "setUnit", HealthConstants.FoodIntake.UNIT, "", "getWeightInKilograms", "()D", "weightInKilograms", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class WeightEditText extends RelativeLayout implements TextView.OnEditorActionListener {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ k[] f36435i = {q0.h(new h0(q0.b(WeightEditText.class), "title", "getTitle()Landroid/widget/TextView;")), q0.h(new h0(q0.b(WeightEditText.class), "weightEditText", "getWeightEditText()Landroid/widget/EditText;")), q0.h(new h0(q0.b(WeightEditText.class), "weightUnitTextView", "getWeightUnitTextView()Landroid/widget/TextView;")), q0.h(new h0(q0.b(WeightEditText.class), "stonesEditText", "getStonesEditText()Landroid/widget/EditText;")), q0.h(new h0(q0.b(WeightEditText.class), "stonesUnitTextView", "getStonesUnitTextView()Landroid/widget/TextView;")), q0.h(new h0(q0.b(WeightEditText.class), "weightError", "getWeightError()Landroid/widget/TextView;"))};

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f36436a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f36437b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f36438c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f36439d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f36440e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f36441f;

    /* renamed from: g  reason: collision with root package name */
    private int f36442g;

    /* renamed from: h  reason: collision with root package name */
    private a f36443h;

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a f36444a;

        b(ym0.a aVar) {
            this.f36444a = aVar;
        }

        @Override // com.withings.design.view.WeightEditText.a
        public final void a() {
            this.f36444a.invoke();
        }
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<EditText> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final EditText invoke() {
            return (EditText) WeightEditText.this.findViewById(C1987R.id.weight_in_stones_edittext);
        }
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) WeightEditText.this.findViewById(C1987R.id.stones_unit);
        }
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    static final class e extends w implements ym0.a<TextView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) WeightEditText.this.findViewById(C1987R.id.title);
        }
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<EditText> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final EditText invoke() {
            return (EditText) WeightEditText.this.findViewById(C1987R.id.weight_edittext);
        }
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<TextView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) WeightEditText.this.findViewById(C1987R.id.weight_error);
        }
    }

    /* compiled from: WeightEditText.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.a<TextView> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) WeightEditText.this.findViewById(C1987R.id.weight_unit);
        }
    }

    public WeightEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
    }

    private final void a(int i11) {
        EditText weightEditText = getWeightEditText();
        u.f(weightEditText, "weightEditText");
        Drawable background = weightEditText.getBackground();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(i11, mode);
        EditText stonesEditText = getStonesEditText();
        u.f(stonesEditText, "stonesEditText");
        stonesEditText.getBackground().setColorFilter(i11, mode);
    }

    private final void b(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(2, C1987R.style.metricTitle);
        TextView weightUnitTextView = getWeightUnitTextView();
        u.f(weightUnitTextView, "weightUnitTextView");
        TextViewKt.setTextStyle(weightUnitTextView, resourceId);
        TextView stonesUnitTextView = getStonesUnitTextView();
        u.f(stonesUnitTextView, "stonesUnitTextView");
        TextViewKt.setTextStyle(stonesUnitTextView, resourceId);
        int resourceId2 = typedArray.getResourceId(3, C1987R.style.bodyRegular);
        EditText weightEditText = getWeightEditText();
        u.f(weightEditText, "weightEditText");
        TextViewKt.setTextStyle(weightEditText, resourceId2);
        EditText stonesEditText = getStonesEditText();
        u.f(stonesEditText, "stonesEditText");
        TextViewKt.setTextStyle(stonesEditText, resourceId2);
        TextView title = getTitle();
        u.f(title, "title");
        TextViewKt.setTextStyle(title, typedArray.getResourceId(1, C1987R.style.bodyRegular));
    }

    private final EditText getStonesEditText() {
        nm0.g gVar = this.f36439d;
        k kVar = f36435i[3];
        return (EditText) gVar.getValue();
    }

    private final TextView getStonesUnitTextView() {
        nm0.g gVar = this.f36440e;
        k kVar = f36435i[4];
        return (TextView) gVar.getValue();
    }

    private final TextView getTitle() {
        nm0.g gVar = this.f36436a;
        k kVar = f36435i[0];
        return (TextView) gVar.getValue();
    }

    private final EditText getWeightEditText() {
        nm0.g gVar = this.f36437b;
        k kVar = f36435i[1];
        return (EditText) gVar.getValue();
    }

    private final TextView getWeightError() {
        nm0.g gVar = this.f36441f;
        k kVar = f36435i[5];
        return (TextView) gVar.getValue();
    }

    private final TextView getWeightUnitTextView() {
        nm0.g gVar = this.f36438c;
        k kVar = f36435i[2];
        return (TextView) gVar.getValue();
    }

    private final void setUnit(int i11) {
        this.f36442g = i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        getWeightEditText().clearFocus();
        getStonesEditText().clearFocus();
    }

    public final int getUnit() {
        return this.f36442g;
    }

    public final double getWeightInKilograms() {
        double parseDouble;
        EditText weightEditText = getWeightEditText();
        u.f(weightEditText, "weightEditText");
        Editable text = weightEditText.getText();
        u.f(text, "weightEditText.text");
        int length = text.length();
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (length == 0) {
            parseDouble = 0.0d;
        } else {
            EditText weightEditText2 = getWeightEditText();
            u.f(weightEditText2, "weightEditText");
            parseDouble = Double.parseDouble(new dp0.h(",").d(weightEditText2.getText().toString(), "."));
        }
        int i11 = this.f36442g;
        if (i11 == 2) {
            int i12 = k70.f.f75665c;
        } else if (i11 == 14) {
            EditText stonesEditText = getStonesEditText();
            u.f(stonesEditText, "stonesEditText");
            Editable text2 = stonesEditText.getText();
            u.f(text2, "stonesEditText.text");
            if (text2.length() != 0) {
                EditText stonesEditText2 = getStonesEditText();
                u.f(stonesEditText2, "stonesEditText");
                d11 = Double.parseDouble(new dp0.h(",").d(stonesEditText2.getText().toString(), "."));
            }
            int i13 = k70.g.f75666c;
            int i14 = k70.f.f75665c;
            parseDouble = (((long) parseDouble) * 14) + d11;
        } else {
            return parseDouble;
        }
        return parseDouble * 0.453592d;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView v11, int i11, KeyEvent event) {
        a aVar;
        u.k(v11, "v");
        u.k(event, "event");
        if (i11 == 6) {
            if ((v11.getId() == C1987R.id.weight_edittext || v11.getId() == C1987R.id.weight_in_stones_edittext) && (aVar = this.f36443h) != null) {
                aVar.a();
                return false;
            }
            return false;
        }
        return false;
    }

    public final void setError(String errorMessage) {
        boolean z5;
        int i11;
        u.k(errorMessage, "errorMessage");
        int i12 = 0;
        if (errorMessage.length() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Context context = getContext();
        u.f(context, "context");
        if (z5) {
            i11 = C1987R.attr.colorError;
        } else {
            i11 = C1987R.attr.colorOnPrimary;
        }
        a(ah.u.x(context, i11));
        TextView weightError = getWeightError();
        u.f(weightError, "weightError");
        weightError.setText(errorMessage);
        TextView weightError2 = getWeightError();
        u.f(weightError2, "weightError");
        if (!z5) {
            i12 = 4;
        }
        weightError2.setVisibility(i12);
    }

    public final void setImeOption(int i11) {
        int i12 = this.f36442g;
        if (i12 != 1) {
            if (i12 == 2 || i12 == 14) {
                EditText stonesEditText = getStonesEditText();
                u.f(stonesEditText, "stonesEditText");
                stonesEditText.setImeOptions(i11 | 268435456);
                return;
            }
            return;
        }
        EditText weightEditText = getWeightEditText();
        u.f(weightEditText, "weightEditText");
        weightEditText.setImeOptions(i11 | 268435456);
    }

    public final void setOnDoneListener(ym0.a<y> listener) {
        u.k(listener, "listener");
        this.f36443h = new b(listener);
    }

    public final void setTitle(int i11) {
        getTitle().setText(i11);
    }

    public WeightEditText(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WeightEditText(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L6
            r4 = r0
        L6:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.u.k(r2, r5)
            r1.<init>(r2, r3, r4, r0)
            com.withings.design.view.WeightEditText$e r4 = new com.withings.design.view.WeightEditText$e
            r4.<init>()
            nm0.g r4 = nm0.h.b(r4)
            r1.f36436a = r4
            com.withings.design.view.WeightEditText$f r4 = new com.withings.design.view.WeightEditText$f
            r4.<init>()
            nm0.g r4 = nm0.h.b(r4)
            r1.f36437b = r4
            com.withings.design.view.WeightEditText$h r4 = new com.withings.design.view.WeightEditText$h
            r4.<init>()
            nm0.g r4 = nm0.h.b(r4)
            r1.f36438c = r4
            com.withings.design.view.WeightEditText$c r4 = new com.withings.design.view.WeightEditText$c
            r4.<init>()
            nm0.g r4 = nm0.h.b(r4)
            r1.f36439d = r4
            com.withings.design.view.WeightEditText$d r4 = new com.withings.design.view.WeightEditText$d
            r4.<init>()
            nm0.g r4 = nm0.h.b(r4)
            r1.f36440e = r4
            com.withings.design.view.WeightEditText$g r4 = new com.withings.design.view.WeightEditText$g
            r4.<init>()
            nm0.g r4 = nm0.h.b(r4)
            r1.f36441f = r4
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r2)
            r5 = 2131560213(0x7f0d0715, float:1.8745792E38)
            r4.inflate(r5, r1)
            android.widget.EditText r4 = r1.getWeightEditText()
            r4.setOnEditorActionListener(r1)
            android.widget.EditText r4 = r1.getStonesEditText()
            r4.setOnEditorActionListener(r1)
            r4 = 2130968895(0x7f04013f, float:1.7546457E38)
            int r4 = ah.u.x(r2, r4)
            if (r3 == 0) goto L8c
            int[] r5 = in.a.f72617s
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5)
            java.lang.String r3 = "context.obtainStyledAttr…styleable.WeightEditText)"
            kotlin.jvm.internal.u.f(r2, r3)
            r1.b(r2)
            int r3 = r2.getColor(r0, r4)
            r1.a(r3)
            nm0.y r3 = nm0.y.f85009a
            r2.recycle()
            goto L8f
        L8c:
            r1.a(r4)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.design.view.WeightEditText.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void setOnDoneListener(a listener) {
        u.k(listener, "listener");
        this.f36443h = listener;
    }
}
