package com.withings.core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.l1;
import com.google.android.material.chip.ChipGroup;
import com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m0.t;
import nm0.h;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: NoteEditionActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/core/ui/NoteEditionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NoteEditionActivity extends Hilt_NoteEditionActivity {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f35360n = 0;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f35361e = h.b(new b());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f35362f = h.b(new a());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f35363g = h.b(new f());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f35364h = h.b(new e());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f35365i = h.b(new g());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f35366j = h.b(new c());

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList f35367k = new ArrayList();
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public ClinicalStudySuggestionRepository f35368l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public pi.a f35369m;

    /* compiled from: NoteEditionActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<ChipGroup> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ChipGroup invoke() {
            return (ChipGroup) NoteEditionActivity.this.findViewById(C1987R.id.chipGroup);
        }
    }

    /* compiled from: NoteEditionActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<AutoCompleteTextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final AutoCompleteTextView invoke() {
            return (AutoCompleteTextView) NoteEditionActivity.this.findViewById(C1987R.id.edition_text);
        }
    }

    /* compiled from: NoteEditionActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<Integer> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            int intExtra = NoteEditionActivity.this.getIntent().getIntExtra("model_id", -1);
            Integer valueOf = Integer.valueOf(intExtra);
            if (intExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: NoteEditionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.core.ui.NoteEditionActivity$onCreate$2", f = "NoteEditionActivity.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35373a;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35373a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                this.f35373a = 1;
                if (NoteEditionActivity.A3(NoteEditionActivity.this, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: NoteEditionActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends w implements ym0.a<String> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String stringExtra = NoteEditionActivity.this.getIntent().getStringExtra("text");
            u.h(stringExtra, "null cannot be cast to non-null type kotlin.String");
            return stringExtra;
        }
    }

    /* compiled from: NoteEditionActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<Toolbar> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) NoteEditionActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: NoteEditionActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<int[]> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final int[] invoke() {
            return NoteEditionActivity.this.getIntent().getIntArrayExtra(WsVasistasSerie.KEY_TYPES);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:26:0x0092). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A3(final com.withings.core.ui.NoteEditionActivity r14, qm0.d r15) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.core.ui.NoteEditionActivity.A3(com.withings.core.ui.NoteEditionActivity, qm0.d):java.lang.Object");
    }

    private final String B3() {
        return (String) this.f35364h.getValue();
    }

    public static void z3(NoteEditionActivity this$0, String text, boolean z5) {
        u.j(this$0, "this$0");
        u.j(text, "$text");
        ArrayList arrayList = this$0.f35367k;
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (u.e((String) ((j) it.next()).a(), text)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        arrayList.set(i11, new j(text, Boolean.valueOf(z5)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // com.withings.core.ui.Hilt_NoteEditionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        setContentView(C1987R.layout.activity_note_edition);
        View findViewById = findViewById(C1987R.id.app_bar);
        u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, true, false, 29);
        View findViewById2 = findViewById(C1987R.id.root);
        u.i(findViewById2, "findViewById(...)");
        ay.b.n(findViewById2, false, true, 23);
        Object value = this.f35363g.getValue();
        u.i(value, "getValue(...)");
        setSupportActionBar((Toolbar) value);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.v(C1987R.string._ADD_A_COMMENT_);
            supportActionBar.o(true);
        }
        if (f7.e.f()) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new d(null), 3, null);
            return;
        }
        Object value2 = this.f35361e.getValue();
        u.i(value2, "getValue(...)");
        ((AutoCompleteTextView) value2).setText(B3());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        menu.add(0, 101010, 0, C1987R.string._SAVE_).setIcon(C1987R.drawable.ic_check_on_surface).setShowAsAction(1);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId != 101010) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(item);
            }
            onBackPressed();
            y yVar = y.f85009a;
            return true;
        }
        ArrayList arrayList = this.f35367k;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            j jVar = (j) it.next();
            String str2 = (String) jVar.a();
            if (((Boolean) jVar.b()).booleanValue()) {
                str = str2;
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        if (this.f35369m != null) {
            Object value = this.f35361e.getValue();
            u.i(value, "getValue(...)");
            setResult(-1, new Intent().putExtra("text", pi.a.b(((AutoCompleteTextView) value).getText().toString(), arrayList2)));
            finish();
            y yVar2 = y.f85009a;
            return true;
        }
        u.s("suggestionParser");
        throw null;
    }
}
