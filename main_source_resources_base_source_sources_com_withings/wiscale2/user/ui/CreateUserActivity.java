package com.withings.wiscale2.user.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputLayout;
import com.withings.common.compose.picker.BirthDateValidator;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.user.ui.EditUserMeasureActivity;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* compiled from: CreateUserActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/user/ui/CreateUserActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreateUserActivity extends Hilt_CreateUserActivity {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f61746t = 0;

    /* renamed from: p  reason: collision with root package name */
    private DateTime f61758p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f61760r;
    @Inject

    /* renamed from: s  reason: collision with root package name */
    public qf.a f61761s;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f61747e = nm0.h.b(new k());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61748f = nm0.h.b(new j());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61749g = nm0.h.b(new e());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61750h = nm0.h.b(new d());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f61751i = nm0.h.b(new i());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f61752j = nm0.h.b(new h());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f61753k = nm0.h.b(new f());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f61754l = nm0.h.b(new g());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f61755m = nm0.h.b(new b());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f61756n = nm0.h.b(new l());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f61757o = nm0.h.b(new c());

    /* renamed from: q  reason: collision with root package name */
    private final User f61759q = new User();

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, String str) {
            Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, CreateUserActivity.class).putExtra("extra_entry_location", str);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) CreateUserActivity.this.findViewById(C1987R.id.user_birthday);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<List<? extends View>> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final List<? extends View> invoke() {
            CreateUserActivity createUserActivity = CreateUserActivity.this;
            return kotlin.collections.x.W(CreateUserActivity.F3(createUserActivity), CreateUserActivity.H3(createUserActivity), CreateUserActivity.G3(createUserActivity));
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextInputLayout> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextInputLayout invoke() {
            return (TextInputLayout) CreateUserActivity.this.findViewById(C1987R.id.edit_user_first_name);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<EditText> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final EditText invoke() {
            return (EditText) CreateUserActivity.this.findViewById(C1987R.id.first_name);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<RadioGroup> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final RadioGroup invoke() {
            return (RadioGroup) CreateUserActivity.this.findViewById(C1987R.id.edit_user_gender_radio_buttons);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) CreateUserActivity.this.findViewById(C1987R.id.edit_user_gender_error);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<TextInputLayout> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final TextInputLayout invoke() {
            return (TextInputLayout) CreateUserActivity.this.findViewById(C1987R.id.edit_user_last_name);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<EditText> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final EditText invoke() {
            return (EditText) CreateUserActivity.this.findViewById(C1987R.id.last_name);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) CreateUserActivity.this.findViewById(C1987R.id.edit_user_title);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) CreateUserActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: CreateUserActivity.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<WorkflowBar> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final WorkflowBar invoke() {
            return (WorkflowBar) CreateUserActivity.this.findViewById(C1987R.id.workflow_bar);
        }
    }

    public static void A3(CreateUserActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.K3();
    }

    public static void B3(CreateUserActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        EditText editText = (EditText) this$0.f61749g.getValue();
        kotlin.jvm.internal.u.i(editText, "<get-firstNameView>(...)");
        ay.b.p(editText);
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        uk.c.a(supportFragmentManager, C1987R.string._BIRTHDAY_, DateTime.now().getMillis(), 0L, 0L, new BirthDateValidator(), new com.withings.wiscale2.user.ui.b(this$0), 12);
    }

    public static void C3(CreateUserActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.J3();
    }

    public static void D3(CreateUserActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.J3();
    }

    public static void E3(CreateUserActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new com.withings.wiscale2.user.ui.c(this$0, null), 3, null);
    }

    public static final TextInputLayout F3(CreateUserActivity createUserActivity) {
        return (TextInputLayout) createUserActivity.f61750h.getValue();
    }

    public static final TextView G3(CreateUserActivity createUserActivity) {
        return (TextView) createUserActivity.f61754l.getValue();
    }

    public static final TextInputLayout H3(CreateUserActivity createUserActivity) {
        return (TextInputLayout) createUserActivity.f61752j.getValue();
    }

    public static final void I3(CreateUserActivity createUserActivity, long j5) {
        createUserActivity.getClass();
        DateTime dateTime = new DateTime(j5);
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        createUserActivity.f61758p = dateTime.withZone(dateTimeZone);
        ((TextView) createUserActivity.f61755m.getValue()).setText(ah.q.a(j5, dateTimeZone, 4));
    }

    private final void J3() {
        String str;
        int i11;
        int i12;
        boolean z5;
        vf.c cVar;
        nm0.g gVar = this.f61749g;
        String obj = ((EditText) gVar.getValue()).getText().toString();
        User user = this.f61759q;
        user.a0(obj);
        user.p0(((EditText) this.f61751i.getValue()).getText().toString());
        String str2 = "";
        if (this.f61760r) {
            cVar = vf.c.f103617d;
            if (cVar != null) {
                str = cVar.h().b();
            } else {
                throw new IllegalArgumentException("You must call init before".toString());
            }
        } else {
            str = "";
        }
        user.Q(str);
        if (((RadioGroup) this.f61753k.getValue()).getCheckedRadioButtonId() == C1987R.id.edit_user_radio_button_woman) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        user.c0(i11);
        user.H(this.f61758p);
        Editable text = ((EditText) gVar.getValue()).getText();
        kotlin.jvm.internal.u.i(text, "getText(...)");
        int length = text.length() - 1;
        int i13 = 0;
        boolean z11 = false;
        while (i13 <= length) {
            if (!z11) {
                i12 = i13;
            } else {
                i12 = length;
            }
            if (kotlin.jvm.internal.u.l(text.charAt(i12), 32) <= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z11) {
                if (!z5) {
                    z11 = true;
                } else {
                    i13++;
                }
            } else if (!z5) {
                break;
            } else {
                length--;
            }
        }
        String upperCase = text.subSequence(i13, length + 1).toString().toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
        String d11 = new dp0.h("[^A-Z0-9]+").d(upperCase, "");
        while (d11.length() < 3) {
            d11 = d11.concat("A");
        }
        if (d11.length() > 3) {
            d11 = d11.substring(0, 3);
            kotlin.jvm.internal.u.i(d11, "substring(...)");
        }
        user.L0(d11);
        user.H0(false);
        String stringExtra = getIntent().getStringExtra("extra_entry_location");
        if (stringExtra != null) {
            str2 = stringExtra;
        }
        EditUserMeasureActivity.a aVar = EditUserMeasureActivity.f61790n;
        boolean z12 = this.f61760r;
        aVar.getClass();
        Intent putExtra = new Intent(this, EditUserMeasureActivity.class).putExtra("extra_user", user).putExtra("extra_entry_location", str2).putExtra("EXTRA_IS_CREATING_MAIN_USER", z12);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        startActivityForResult(putExtra, 22);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    private final void K3() {
        qc.b bVar = new qc.b(this);
        bVar.C(C1987R.string._HEALTH_MATE_);
        bVar.g(C1987R.string.createUser_disconnect);
        bVar.z(C1987R.string._OK_, new ao.d(this, 1)).w(C1987R.string._CANCEL_, new Object()).s();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void z3(com.withings.wiscale2.user.ui.CreateUserActivity r7) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.CreateUserActivity.z3(com.withings.wiscale2.user.ui.CreateUserActivity):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 22) {
            if (i12 == -1) {
                setResult(-1);
            }
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f61760r) {
            K3();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.user.ui.Hilt_CreateUserActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_create_user);
        this.f61760r = m70.i.b().c().isEmpty();
        setSupportActionBar((Toolbar) this.f61747e.getValue());
        if (!this.f61760r) {
            ((TextView) this.f61748f.getValue()).setText(getString(C1987R.string._TELL_US_MORE_USER_));
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(!this.f61760r);
        }
        nm0.g gVar = this.f61756n;
        ((WorkflowBar) gVar.getValue()).setRightClickListener(new com.google.android.material.datepicker.q(this, 12));
        if (this.f61760r) {
            ((WorkflowBar) gVar.getValue()).setLeftText(C1987R.string._BACK_);
            ((WorkflowBar) gVar.getValue()).setLeftClickListener(new sg.j(this, 12));
        }
        ((TextView) this.f61755m.getValue()).setOnClickListener(new com.google.android.material.search.g(this, 14));
        TextInputLayout textInputLayout = (TextInputLayout) this.f61750h.getValue();
        kotlin.jvm.internal.u.i(textInputLayout, "<get-firstNameInputLayout>(...)");
        br.a.a(textInputLayout);
        TextInputLayout textInputLayout2 = (TextInputLayout) this.f61752j.getValue();
        kotlin.jvm.internal.u.i(textInputLayout2, "<get-lastNameInputLayout>(...)");
        br.a.a(textInputLayout2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
