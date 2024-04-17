package com.withings.wiscale2.account.password;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.v0;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import com.google.android.material.textfield.TextInputLayout;
import com.withings.wiscale2.C1987R;
import i6.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: PasswordEditionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/account/password/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class k extends com.withings.wiscale2.account.password.d {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f48148u = 0;

    /* renamed from: h  reason: collision with root package name */
    private View f48149h;

    /* renamed from: i  reason: collision with root package name */
    private Button f48150i;

    /* renamed from: j  reason: collision with root package name */
    private EditText f48151j;

    /* renamed from: k  reason: collision with root package name */
    private EditText f48152k;

    /* renamed from: l  reason: collision with root package name */
    private EditText f48153l;

    /* renamed from: m  reason: collision with root package name */
    private TextInputLayout f48154m;

    /* renamed from: n  reason: collision with root package name */
    private TextInputLayout f48155n;

    /* renamed from: o  reason: collision with root package name */
    private TextInputLayout f48156o;

    /* renamed from: p  reason: collision with root package name */
    private Toolbar f48157p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f48158q;

    /* renamed from: r  reason: collision with root package name */
    private ProgressDialog f48159r;

    /* renamed from: s  reason: collision with root package name */
    private final i1 f48160s;

    /* renamed from: t  reason: collision with root package name */
    private a f48161t;

    /* compiled from: PasswordEditionFragment.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void A1(k kVar);

        void O0(k kVar);

        void j3(k kVar);
    }

    /* compiled from: PasswordEditionFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.l<Integer, y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Integer num) {
            k.y1(k.this, num);
            return y.f85009a;
        }
    }

    /* compiled from: PasswordEditionFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.l<Boolean, y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            k.z1(k.this);
            return y.f85009a;
        }
    }

    /* compiled from: PasswordEditionFragment.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.l<String, y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(String str) {
            if (str != null) {
                int i11 = k.f48148u;
                Toast.makeText(k.this.getContext(), (int) C1987R.string._ERROR_AUTHFAILED_, 1).show();
            }
            return y.f85009a;
        }
    }

    /* compiled from: PasswordEditionFragment.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.l<Boolean, y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            k.A1(k.this, bool);
            return y.f85009a;
        }
    }

    /* compiled from: PasswordEditionFragment.kt */
    /* loaded from: classes4.dex */
    static final class f extends w implements ym0.l<Boolean, y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            k.x1(k.this, bool);
            return y.f85009a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements ym0.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f48167a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f48167a = fragment;
        }

        @Override // ym0.a
        public final Fragment invoke() {
            return this.f48167a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements ym0.a<n1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a f48168a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f48168a = gVar;
        }

        @Override // ym0.a
        public final n1 invoke() {
            return (n1) this.f48168a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f48169a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(nm0.g gVar) {
            super(0);
            this.f48169a = gVar;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return ((n1) this.f48169a.getValue()).getViewModelStore();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f48170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(nm0.g gVar) {
            super(0);
            this.f48170a = gVar;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            u uVar;
            n1 n1Var = (n1) this.f48170a.getValue();
            if (n1Var instanceof u) {
                uVar = (u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return uVar.getDefaultViewModelCreationExtras();
            }
            return a.C1058a.f71431b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: com.withings.wiscale2.account.password.k$k  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0662k extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f48171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nm0.g f48172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0662k(Fragment fragment, nm0.g gVar) {
            super(0);
            this.f48171a = fragment;
            this.f48172b = gVar;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            u uVar;
            k1.b defaultViewModelProviderFactory;
            n1 n1Var = (n1) this.f48172b.getValue();
            if (n1Var instanceof u) {
                uVar = (u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar == null || (defaultViewModelProviderFactory = uVar.getDefaultViewModelProviderFactory()) == null) {
                k1.b defaultViewModelProviderFactory2 = this.f48171a.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.u.i(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
            return defaultViewModelProviderFactory;
        }
    }

    public k() {
        nm0.g a11 = nm0.h.a(LazyThreadSafetyMode.f76138c, new h(new g(this)));
        this.f48160s = v0.a(this, q0.b(ChangePasswordViewModel.class), new i(a11), new j(a11), new C0662k(this, a11));
    }

    public static final void A1(k kVar, Boolean bool) {
        kVar.getClass();
        if (kotlin.jvm.internal.u.e(bool, Boolean.TRUE)) {
            Button button = kVar.f48150i;
            if (button != null) {
                button.setText("");
                Button button2 = kVar.f48150i;
                if (button2 != null) {
                    button2.setEnabled(false);
                    View view = kVar.f48149h;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("loadingAnimation");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("button");
                throw null;
            }
            kotlin.jvm.internal.u.s("button");
            throw null;
        }
        Button button3 = kVar.f48150i;
        if (button3 != null) {
            button3.setText(kVar.getString(C1987R.string.passwordEdition_updateButton));
            Button button4 = kVar.f48150i;
            if (button4 != null) {
                button4.setEnabled(true);
                View view2 = kVar.f48149h;
                if (view2 != null) {
                    view2.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("loadingAnimation");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("button");
            throw null;
        }
        kotlin.jvm.internal.u.s("button");
        throw null;
    }

    private final void B1() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getCurrentFocus() != null) {
            EditText editText = this.f48151j;
            if (editText != null) {
                Object systemService = editText.getContext().getSystemService("input_method");
                kotlin.jvm.internal.u.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = this.f48151j;
                if (editText2 != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                } else {
                    kotlin.jvm.internal.u.s("oldPasswordView");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("oldPasswordView");
                throw null;
            }
        }
        ChangePasswordViewModel C1 = C1();
        EditText editText3 = this.f48151j;
        if (editText3 != null) {
            String obj = editText3.getText().toString();
            EditText editText4 = this.f48152k;
            if (editText4 != null) {
                String obj2 = editText4.getText().toString();
                EditText editText5 = this.f48153l;
                if (editText5 != null) {
                    C1.i0(obj, obj2, editText5.getText().toString());
                    return;
                } else {
                    kotlin.jvm.internal.u.s("confirmPasswordView");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("newPasswordView");
            throw null;
        }
        kotlin.jvm.internal.u.s("oldPasswordView");
        throw null;
    }

    private final ChangePasswordViewModel C1() {
        return (ChangePasswordViewModel) this.f48160s.getValue();
    }

    public static void s1(k this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        dialogInterface.dismiss();
        TextView textView = this$0.f48158q;
        if (textView != null) {
            ProgressDialog show = ProgressDialog.show(textView.getContext(), null, this$0.getString(C1987R.string._LOADING_), true, false);
            kotlin.jvm.internal.u.i(show, "show(...)");
            this$0.f48159r = show;
            ChangePasswordViewModel C1 = this$0.C1();
            BuildersKt__Builders_commonKt.launch$default(h1.a(C1), Dispatchers.getIO(), null, new com.withings.wiscale2.account.password.a(C1, null), 2, null);
            return;
        }
        kotlin.jvm.internal.u.s("forgotPassword");
        throw null;
    }

    public static void t1(k this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f48161t;
        if (aVar != null) {
            aVar.A1(this$0);
        }
    }

    public static void u1(k this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        TextView textView = this$0.f48158q;
        if (textView != null) {
            qc.b bVar = new qc.b(textView.getContext());
            bVar.C(C1987R.string._CHANGE_PASSWORD_);
            bVar.g(C1987R.string._NO_VALID_MAIL_ADDRESS_ERROR_MESSAGE_);
            bVar.w(C1987R.string._CANCEL_, null).z(C1987R.string._SEND_, new com.withings.ecg.heartsound.c(this$0, 3)).s();
            return;
        }
        kotlin.jvm.internal.u.s("forgotPassword");
        throw null;
    }

    public static void v1(k this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.B1();
    }

    public static void w1(k this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.B1();
    }

    public static final void x1(k kVar, Boolean bool) {
        ProgressDialog progressDialog = kVar.f48159r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (kotlin.jvm.internal.u.e(bool, Boolean.FALSE)) {
            Toast.makeText(kVar.getContext(), w6.o.a(kVar.getString(C1987R.string._FORGOT_PASSWORD_ERROR_TITLE_), ",\n", kVar.getString(C1987R.string._FORGOT_PASSWORD_ERROR_MESSAGE_)), 0).show();
            return;
        }
        a aVar = kVar.f48161t;
        if (aVar != null) {
            aVar.j3(kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y1(com.withings.wiscale2.account.password.k r5, java.lang.Integer r6) {
        /*
            com.google.android.material.textfield.TextInputLayout r0 = r5.f48154m
            r1 = 0
            if (r0 == 0) goto L81
            if (r6 != 0) goto L9
        L7:
            r6 = r1
            goto L33
        L9:
            r2 = 2132017291(0x7f14008b, float:1.9672856E38)
            int r3 = r6.intValue()
            if (r3 != r2) goto L25
            int r6 = r6.intValue()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r6 = r5.getString(r6, r2)
            goto L33
        L25:
            int r2 = r6.intValue()
            if (r2 <= 0) goto L7
            int r6 = r6.intValue()
            java.lang.String r6 = r5.getString(r6)
        L33:
            r0.setError(r6)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r0 = 2132017785(0x7f140279, float:1.9673858E38)
            java.lang.String r0 = r5.getString(r0)
            android.text.SpannableStringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r6 = r6.append(r0)
            r0 = 2132024891(0x7f141e3b, float:1.968827E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.u.i(r0, r2)
            r6.append(r0)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r3 = 1
            r2.<init>(r3)
            int r3 = r6.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            int r0 = r6.length()
            r4 = 17
            r6.setSpan(r2, r3, r0, r4)
            android.widget.TextView r5 = r5.f48158q
            if (r5 == 0) goto L7b
            r5.setText(r6)
            return
        L7b:
            java.lang.String r5 = "forgotPassword"
            kotlin.jvm.internal.u.s(r5)
            throw r1
        L81:
            java.lang.String r5 = "oldPasswordLayout"
            kotlin.jvm.internal.u.s(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.account.password.k.y1(com.withings.wiscale2.account.password.k, java.lang.Integer):void");
    }

    public static final void z1(k kVar) {
        a aVar = kVar.f48161t;
        if (aVar != null) {
            aVar.O0(kVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        EditText editText = this.f48153l;
        if (editText != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.withings.wiscale2.account.password.j
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    k.v1(k.this);
                    return true;
                }
            });
            TextView textView = this.f48158q;
            if (textView != null) {
                textView.setOnClickListener(new com.google.android.material.search.j(this, 7));
                Button button = this.f48150i;
                if (button != null) {
                    button.setOnClickListener(new com.google.android.material.search.k(this, 7));
                    Toolbar toolbar = this.f48157p;
                    if (toolbar != null) {
                        toolbar.setNavigationOnClickListener(new sg.f(this, 7));
                        TextInputLayout[] textInputLayoutArr = new TextInputLayout[3];
                        TextInputLayout textInputLayout = this.f48154m;
                        if (textInputLayout != null) {
                            textInputLayoutArr[0] = textInputLayout;
                            TextInputLayout textInputLayout2 = this.f48155n;
                            if (textInputLayout2 != null) {
                                textInputLayoutArr[1] = textInputLayout2;
                                TextInputLayout textInputLayout3 = this.f48156o;
                                if (textInputLayout3 != null) {
                                    textInputLayoutArr[2] = textInputLayout3;
                                    for (TextInputLayout textInputLayout4 : x.W(textInputLayoutArr)) {
                                        br.a.a(textInputLayout4);
                                    }
                                    TextInputLayout textInputLayout5 = this.f48154m;
                                    if (textInputLayout5 != null) {
                                        br.a.a(textInputLayout5);
                                        TextInputLayout textInputLayout6 = this.f48155n;
                                        if (textInputLayout6 != null) {
                                            br.a.a(textInputLayout6);
                                            TextInputLayout textInputLayout7 = this.f48156o;
                                            if (textInputLayout7 != null) {
                                                br.a.a(textInputLayout7);
                                                k0<Integer> p02 = C1().p0();
                                                TextInputLayout textInputLayout8 = this.f48155n;
                                                if (textInputLayout8 != null) {
                                                    p02.observe(getViewLifecycleOwner(), new m(new l(textInputLayout8, this)));
                                                    k0<Integer> k02 = C1().k0();
                                                    TextInputLayout textInputLayout9 = this.f48156o;
                                                    if (textInputLayout9 != null) {
                                                        k02.observe(getViewLifecycleOwner(), new m(new l(textInputLayout9, this)));
                                                        C1().q0().observe(getViewLifecycleOwner(), new m(new b()));
                                                        C1().r0().observe(getViewLifecycleOwner(), new m(new c()));
                                                        C1().j0().observe(getViewLifecycleOwner(), new m(new d()));
                                                        C1().t0().observe(getViewLifecycleOwner(), new m(new e()));
                                                        C1().m0().observe(getViewLifecycleOwner(), new m(new f()));
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.u.s("confirmPasswordLayout");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.u.s("newPasswordLayout");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.u.s("confirmPasswordLayout");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.u.s("newPasswordLayout");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.u.s("oldPasswordLayout");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("confirmPasswordLayout");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("newPasswordLayout");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("oldPasswordLayout");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("toolbar");
                    throw null;
                }
                kotlin.jvm.internal.u.s("button");
                throw null;
            }
            kotlin.jvm.internal.u.s("forgotPassword");
            throw null;
        }
        kotlin.jvm.internal.u.s("confirmPasswordView");
        throw null;
    }

    @Override // com.withings.wiscale2.account.password.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f48161t = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f48161t = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.button_loading);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f48149h = findViewById;
        View findViewById2 = view.findViewById(C1987R.id.button);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f48150i = (Button) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.old_password);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f48151j = (EditText) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.password);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f48152k = (EditText) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.confirm_password);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f48153l = (EditText) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.old_password_container);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f48154m = (TextInputLayout) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.password_container);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.f48155n = (TextInputLayout) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.confirm_password_container);
        kotlin.jvm.internal.u.i(findViewById8, "findViewById(...)");
        this.f48156o = (TextInputLayout) findViewById8;
        View findViewById9 = view.findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById9, "findViewById(...)");
        this.f48157p = (Toolbar) findViewById9;
        View findViewById10 = view.findViewById(C1987R.id.resend_password_button);
        kotlin.jvm.internal.u.i(findViewById10, "findViewById(...)");
        this.f48158q = (TextView) findViewById10;
    }
}
