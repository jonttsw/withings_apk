package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.withings.wiscale2.C1987R;
/* compiled from: EditPoolLengthSheetFragment.kt */
/* loaded from: classes4.dex */
public final class v extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private Integer f49711c;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.l<Integer, nm0.y> f49712d;

    /* renamed from: e  reason: collision with root package name */
    private androidx.appcompat.app.c f49713e;

    /* renamed from: f  reason: collision with root package name */
    private View f49714f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f49715g = nm0.h.b(new g());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f49716h = nm0.h.b(new d());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f49717i = nm0.h.b(new e());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f49718j = nm0.h.b(new f());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f49719k = nm0.h.b(new b());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f49720l = nm0.h.b(new c());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f49721m = nm0.h.b(new a());

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Button> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (Button) view.findViewById(C1987R.id.confirm);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Button> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (Button) view.findViewById(C1987R.id.open_water);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Button> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (Button) view.findViewById(C1987R.id.personalize);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<MaterialButton> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialButton invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (MaterialButton) view.findViewById(C1987R.id.pool_length_1);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<MaterialButton> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialButton invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (MaterialButton) view.findViewById(C1987R.id.pool_length_2);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<MaterialButton> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialButton invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (MaterialButton) view.findViewById(C1987R.id.pool_length_3);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EditPoolLengthSheetFragment.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Flow> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Flow invoke() {
            View view = v.this.f49714f;
            if (view != null) {
                return (Flow) view.findViewById(C1987R.id.pool_lengths);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(Integer num, ym0.l<? super Integer, nm0.y> lVar) {
        this.f49711c = num;
        this.f49712d = lVar;
    }

    private final void A1(MaterialButton materialButton, final int i11) {
        int i12;
        Integer num = this.f49711c;
        if (num != null && i11 == num.intValue()) {
            i12 = C1987R.color.pool_length_button_bg_selected;
        } else {
            i12 = C1987R.color.pool_length_button_bg;
        }
        materialButton.setStrokeColor(androidx.core.content.a.getColorStateList(((Flow) this.f49715g.getValue()).getContext(), i12));
        k70.d dVar = new k70.d();
        Context context = materialButton.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        materialButton.setText(dVar.c(context, i11));
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.u1(v.this, i11);
            }
        });
    }

    private final void B1() {
        MaterialButton materialButton = (MaterialButton) this.f49716h.getValue();
        kotlin.jvm.internal.u.i(materialButton, "<get-poolLength1Button>(...)");
        A1(materialButton, 25);
        MaterialButton materialButton2 = (MaterialButton) this.f49717i.getValue();
        kotlin.jvm.internal.u.i(materialButton2, "<get-poolLength2Button>(...)");
        A1(materialButton2, 33);
        MaterialButton materialButton3 = (MaterialButton) this.f49718j.getValue();
        kotlin.jvm.internal.u.i(materialButton3, "<get-poolLength3Button>(...)");
        A1(materialButton3, 50);
    }

    public static void s1(v this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.f49712d.invoke(0);
        this$0.dismiss();
    }

    public static void t1(v this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Integer num = this$0.f49711c;
        if (num != null) {
            this$0.f49712d.invoke(Integer.valueOf(num.intValue()));
        }
        this$0.dismiss();
    }

    public static void u1(v this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.f49711c = Integer.valueOf(i11);
        this$0.B1();
    }

    public static void v1(TextInputEditText textInputEditText, v this$0) {
        Editable text;
        String obj;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (textInputEditText != null && (text = textInputEditText.getText()) != null && (obj = text.toString()) != null) {
            this$0.f49712d.invoke(Integer.valueOf(Integer.parseInt(obj)));
        }
        this$0.dismiss();
    }

    public static void w1(v this$0) {
        TextInputEditText textInputEditText;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        View inflate = this$0.getLayoutInflater().inflate(C1987R.layout.dialog_edit_pool_length, (ViewGroup) null);
        if (inflate != null) {
            textInputEditText = (TextInputEditText) inflate.findViewById(C1987R.id.pool_length_input);
        } else {
            textInputEditText = null;
        }
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(new u(new w(textInputEditText, this$0)));
        }
        androidx.appcompat.app.c s11 = new qc.b(this$0.requireContext()).B(this$0.getString(C1987R.string.workout_detailView_swim_poolSize_title)).D(inflate).z(C1987R.string._CONFIRM_YES_, new s(textInputEditText, this$0, 0)).w(C1987R.string._CANCEL_, null).s();
        this$0.f49713e = s11;
        Button g11 = s11.g(-1);
        if (g11 != null) {
            g11.setVisibility(8);
        }
        this$0.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [en0.i, en0.k] */
    public static final boolean z1(v vVar, String str) {
        Integer valueOf;
        vVar.getClass();
        if (str != null) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            valueOf = null;
        }
        ?? iVar = new en0.i(10, 50, 1);
        if (valueOf == null || !iVar.s(valueOf.intValue())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C1987R.style.CustomBottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.l, androidx.appcompat.app.u, androidx.fragment.app.m
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.u.h(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.k kVar = (com.google.android.material.bottomsheet.k) onCreateDialog;
        kVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.r
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                com.google.android.material.bottomsheet.k bottomSheetDialog = com.google.android.material.bottomsheet.k.this;
                kotlin.jvm.internal.u.j(bottomSheetDialog, "$bottomSheetDialog");
                kotlin.jvm.internal.u.h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                int i11 = bottomSheetDialog.getContext().getResources().getDisplayMetrics().widthPixels;
                FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.k) dialogInterface).findViewById(C1987R.id.design_bottom_sheet);
                if (frameLayout != null) {
                    BottomSheetBehavior V = BottomSheetBehavior.V(frameLayout);
                    kotlin.jvm.internal.u.i(V, "from(...)");
                    V.g0((int) (i11 * 1.46f));
                    V.i0(3);
                    V.h0();
                    V.f0(true);
                }
            }
        });
        return kVar;
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = View.inflate(getContext(), C1987R.layout.dialog_choice_pool_length, null);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        this.f49714f = inflate;
        dialog.setContentView(inflate);
        B1();
        ((Button) this.f49720l.getValue()).setOnClickListener(new sg.b(this, 6));
        ((Button) this.f49719k.getValue()).setOnClickListener(new sg.c(this, 6));
        ((Button) this.f49721m.getValue()).setOnClickListener(new sg.d(this, 4));
    }
}
