package com.withings.wiscale2.user.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.withings.user.User;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EditUserEmailActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/user/ui/EditUserEmailActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EditUserEmailActivity extends Hilt_EditUserEmailActivity {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f61773n = 0;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f61774e = nm0.h.b(new e());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61775f = nm0.h.b(new d());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61776g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61777h = nm0.h.b(new b());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f61778i = nm0.h.b(new a());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f61779j = nm0.h.b(new g());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f61780k = nm0.h.b(new f());

    /* renamed from: l  reason: collision with root package name */
    private ProgressDialog f61781l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public q70.l f61782m;

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextInputLayout> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextInputLayout invoke() {
            return (TextInputLayout) EditUserEmailActivity.this.findViewById(C1987R.id.edit_user_email_container);
        }
    }

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<EditText> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final EditText invoke() {
            return (EditText) EditUserEmailActivity.this.findViewById(C1987R.id.email);
        }
    }

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EditUserEmailActivity.this.findViewById(C1987R.id.edit_user_email_subtitle);
        }
    }

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EditUserEmailActivity.this.findViewById(C1987R.id.edit_user_email_title);
        }
    }

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) EditUserEmailActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<User> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            Parcelable parcelableExtra = EditUserEmailActivity.this.getIntent().getParcelableExtra("extra_user");
            kotlin.jvm.internal.u.h(parcelableExtra, "null cannot be cast to non-null type com.withings.user.User");
            return (User) parcelableExtra;
        }
    }

    /* compiled from: EditUserEmailActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<WorkflowBar> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final WorkflowBar invoke() {
            return (WorkflowBar) EditUserEmailActivity.this.findViewById(C1987R.id.workflow_bar);
        }
    }

    public static boolean A3(EditUserEmailActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (i11 == 6) {
            this$0.G3();
            return true;
        }
        return false;
    }

    public static final TextInputLayout B3(EditUserEmailActivity editUserEmailActivity) {
        return (TextInputLayout) editUserEmailActivity.f61778i.getValue();
    }

    public static final User D3(EditUserEmailActivity editUserEmailActivity) {
        return (User) editUserEmailActivity.f61780k.getValue();
    }

    public static final void E3(EditUserEmailActivity editUserEmailActivity) {
        ProgressDialog progressDialog = editUserEmailActivity.f61781l;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        editUserEmailActivity.f61781l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText F3() {
        return (EditText) this.f61777h.getValue();
    }

    private final void G3() {
        if (F3().getText().toString().length() == 0) {
            finish();
            return;
        }
        Editable text = F3().getText();
        kotlin.jvm.internal.u.i(text, "getText(...)");
        if (text.length() == 0 || !Patterns.EMAIL_ADDRESS.matcher(F3().getText()).matches()) {
            ((TextInputLayout) this.f61778i.getValue()).setError(getString(C1987R.string.mail_wrong_format));
            return;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(F3().getWindowToken(), 0);
        if (this.f61781l == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(C1987R.string._LOADING_));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            progressDialog.setButton(-2, getString(C1987R.string._CANCEL_), new p40.b(3, progressDialog, this));
            progressDialog.show();
            this.f61781l = progressDialog;
        }
        ((User) this.f61780k.getValue()).Q(F3().getText().toString());
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new com.withings.wiscale2.user.ui.f(this, null), 2, null);
    }

    public static void z3(EditUserEmailActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.G3();
    }

    @Override // com.withings.wiscale2.user.ui.Hilt_EditUserEmailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_edit_user_email);
        setSupportActionBar((Toolbar) this.f61774e.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        nm0.g gVar = this.f61780k;
        ((TextView) this.f61775f.getValue()).setText(getString(C1987R.string._USER_CREATION_EMAIL_REQUEST_TITLE__s_, ((User) gVar.getValue()).l()));
        TextView textView = (TextView) this.f61776g.getValue();
        if (((User) gVar.getValue()).p() == 0) {
            string = getString(C1987R.string._USER_CREATION_EMAIL_REQUEST_DESC_HIM_);
        } else {
            string = getString(C1987R.string._USER_CREATION_EMAIL_REQUEST_DESC_HER_);
        }
        textView.setText(string);
        F3().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.withings.wiscale2.user.ui.e
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i11, KeyEvent keyEvent) {
                return EditUserEmailActivity.A3(EditUserEmailActivity.this, i11);
            }
        });
        ((WorkflowBar) this.f61779j.getValue()).setRightClickListener(new sg.g(this, 20));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
