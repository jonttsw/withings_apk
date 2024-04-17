package com.withings.measure.detail.ui.views;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository;
import com.withings.core.ui.NoteEditionActivity;
import com.withings.features.InternalSetting;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import pi.a;
import ym0.l;
import ym0.p;
/* compiled from: AddDetailsView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001:B'\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020+¢\u0006\u0004\b8\u00109J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u00102\u001a\u0004\u0018\u00010+2\b\u0010#\u001a\u0004\u0018\u00010+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, d2 = {"Lcom/withings/measure/detail/ui/views/AddDetailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withings/measure/detail/ui/views/AddDetailsView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "setListener", "(Lcom/withings/measure/detail/ui/views/AddDetailsView$a;)V", "Lkotlin/Function1;", "", "(Lym0/l;)V", "", "Lcom/withings/measure/detail/ui/views/j;", FirebaseAnalytics.Param.ITEMS, "setDetailsItems", "(Ljava/util/List;)V", "text", "setText", "(Ljava/lang/String;)V", "Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;", "G", "Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;", "getSuggestionRepository", "()Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;", "setSuggestionRepository", "(Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;)V", "suggestionRepository", "Lpi/a;", "M", "Lpi/a;", "getSuggestionParser", "()Lpi/a;", "setSuggestionParser", "(Lpi/a;)V", "suggestionParser", "", "value", "P", "[I", "getTypes", "()[I", "setTypes", "([I)V", WsVasistasSerie.KEY_TYPES, "", "Q", "Ljava/lang/Integer;", "getDeviceModel", "()Ljava/lang/Integer;", "setDeviceModel", "(Ljava/lang/Integer;)V", "deviceModel", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddDetailsView extends k {
    private ArrayList A;
    private a B;
    private String F;
    @Inject
    public ClinicalStudySuggestionRepository G;
    @Inject
    public pi.a M;
    private int[] P;
    private Integer Q;

    /* renamed from: v  reason: collision with root package name */
    private RecyclerView f41804v;

    /* renamed from: w  reason: collision with root package name */
    private MaterialCardView f41805w;

    /* renamed from: x  reason: collision with root package name */
    private TextView f41806x;

    /* renamed from: y  reason: collision with root package name */
    private final ChipGroup f41807y;

    /* renamed from: z  reason: collision with root package name */
    private final com.withings.measure.detail.ui.views.a f41808z;

    /* compiled from: AddDetailsView.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: AddDetailsView.kt */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<String, y> f41809a;

        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super String, y> lVar) {
            this.f41809a = lVar;
        }

        @Override // com.withings.measure.detail.ui.views.AddDetailsView.a
        public final void a(String note) {
            u.j(note, "note");
            this.f41809a.invoke(note);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddDetailsView.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measure.detail.ui.views.AddDetailsView$setupWithSuggestions$suggestions$1$1", f = "AddDetailsView.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super List<? extends String>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41810a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41812c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f41812c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f41812c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends String>> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41810a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                AddDetailsView addDetailsView = AddDetailsView.this;
                ClinicalStudySuggestionRepository suggestionRepository = addDetailsView.getSuggestionRepository();
                Integer deviceModel = addDetailsView.getDeviceModel();
                this.f41810a = 1;
                obj = suggestionRepository.getFor(this.f41812c, deviceModel, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public static void t(AddDetailsView this$0, String text, String note, boolean z5) {
        u.j(this$0, "this$0");
        u.j(text, "$text");
        u.j(note, "$note");
        Iterator it = this$0.A.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (u.e((String) ((nm0.j) it.next()).a(), text)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        this$0.A.set(i11, new nm0.j(text, Boolean.valueOf(z5)));
        ArrayList<nm0.j> arrayList = this$0.A;
        ArrayList arrayList2 = new ArrayList();
        for (nm0.j jVar : arrayList) {
            String str = (String) jVar.a();
            if (!((Boolean) jVar.b()).booleanValue()) {
                str = null;
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        this$0.getSuggestionParser().getClass();
        String b10 = pi.a.b(note, arrayList2);
        a aVar = this$0.B;
        if (aVar != null) {
            aVar.a(b10);
        }
    }

    public static void u(AddDetailsView this$0, View view) {
        int i11;
        u.j(this$0, "this$0");
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        int i12 = NoteEditionActivity.f35360n;
        String str = this$0.F;
        if (str == null) {
            str = "";
        }
        int[] types = this$0.P;
        Integer num = this$0.Q;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        u.j(types, "types");
        Intent putExtra = new Intent(context, NoteEditionActivity.class).putExtra(WsVasistasSerie.KEY_TYPES, types).putExtra("model_id", i11);
        u.i(putExtra, "putExtra(...)");
        putExtra.putExtra("text", str);
        wq.a.q(context, putExtra, new com.withings.measure.detail.ui.views.c(this$0));
    }

    private final void w() {
        pi.a suggestionParser = getSuggestionParser();
        String str = this.F;
        if (str == null) {
            str = "";
        }
        suggestionParser.getClass();
        a.C1520a a11 = pi.a.a(str);
        int[] iArr = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            x.n((Iterable) BuildersKt.runBlocking$default(null, new c(i11, null), 1, null), arrayList);
        }
        List<String> B = x.B(x.l0(a11.b(), arrayList));
        ArrayList arrayList2 = new ArrayList(x.y(B, 10));
        for (String str2 : B) {
            arrayList2.add(new nm0.j(str2, Boolean.valueOf(a11.b().contains(str2))));
        }
        this.A = x.S0(arrayList2);
        boolean z5 = !arrayList2.isEmpty();
        ChipGroup chipGroup = this.f41807y;
        if (z5) {
            chipGroup.setVisibility(0);
            chipGroup.removeAllViews();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                nm0.j jVar = (nm0.j) it.next();
                final String str3 = (String) jVar.a();
                boolean booleanValue = ((Boolean) jVar.b()).booleanValue();
                final String a12 = a11.a();
                Chip chip = new Chip(getContext(), null);
                chip.setText(str3);
                chip.setClickable(true);
                chip.setCheckable(true);
                chip.setChecked(booleanValue);
                chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withings.measure.detail.ui.views.b
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        AddDetailsView.t(AddDetailsView.this, str3, a12, z11);
                    }
                });
                chipGroup.addView(chip);
            }
        } else {
            chipGroup.setVisibility(8);
        }
        TextView textView = this.f41806x;
        if (textView != null) {
            textView.setText(a11.a());
        } else {
            u.s("noteTextView");
            throw null;
        }
    }

    public final Integer getDeviceModel() {
        return this.Q;
    }

    public final pi.a getSuggestionParser() {
        pi.a aVar = this.M;
        if (aVar != null) {
            return aVar;
        }
        u.s("suggestionParser");
        throw null;
    }

    public final ClinicalStudySuggestionRepository getSuggestionRepository() {
        ClinicalStudySuggestionRepository clinicalStudySuggestionRepository = this.G;
        if (clinicalStudySuggestionRepository != null) {
            return clinicalStudySuggestionRepository;
        }
        u.s("suggestionRepository");
        throw null;
    }

    public final int[] getTypes() {
        return this.P;
    }

    public final void setDetailsItems(List<j> items) {
        u.j(items, "items");
        this.f41808z.d(items);
    }

    public final void setDeviceModel(Integer num) {
        this.Q = num;
        if (wr.b.c(InternalSetting.f39149h)) {
            w();
        }
    }

    public final void setListener(l<? super String, y> listener) {
        u.j(listener, "listener");
        this.B = new b(listener);
    }

    public final void setSuggestionParser(pi.a aVar) {
        u.j(aVar, "<set-?>");
        this.M = aVar;
    }

    public final void setSuggestionRepository(ClinicalStudySuggestionRepository clinicalStudySuggestionRepository) {
        u.j(clinicalStudySuggestionRepository, "<set-?>");
        this.G = clinicalStudySuggestionRepository;
    }

    public final void setText(String str) {
        this.F = str;
        if (wr.b.c(InternalSetting.f39149h)) {
            w();
            return;
        }
        TextView textView = this.f41806x;
        if (textView != null) {
            textView.setText(str);
        } else {
            u.s("noteTextView");
            throw null;
        }
    }

    public final void setTypes(int[] value) {
        u.j(value, "value");
        this.P = value;
        if (wr.b.c(InternalSetting.f39149h)) {
            w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDetailsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        com.withings.measure.detail.ui.views.a aVar = new com.withings.measure.detail.ui.views.a();
        this.f41808z = aVar;
        this.A = new ArrayList();
        LayoutInflater.from(getContext()).inflate(C1987R.layout.view_add_details, this);
        View findViewById = findViewById(C1987R.id.chipGroup);
        u.i(findViewById, "findViewById(...)");
        this.f41807y = (ChipGroup) findViewById;
        View findViewById2 = findViewById(C1987R.id.details_recyclerview);
        u.i(findViewById2, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f41804v = recyclerView;
        recyclerView.setScrollBarStyle(33554432);
        RecyclerView recyclerView2 = this.f41804v;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(false);
            RecyclerView recyclerView3 = this.f41804v;
            if (recyclerView3 != null) {
                recyclerView3.getContext();
                recyclerView3.setLayoutManager(new LinearLayoutManager(0));
                RecyclerView recyclerView4 = this.f41804v;
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(aVar);
                    h0 h0Var = new h0();
                    RecyclerView recyclerView5 = this.f41804v;
                    if (recyclerView5 != null) {
                        h0Var.a(recyclerView5);
                        View findViewById3 = findViewById(C1987R.id.details_card_note);
                        u.i(findViewById3, "findViewById(...)");
                        this.f41805w = (MaterialCardView) findViewById3;
                        View findViewById4 = findViewById(C1987R.id.details_text_note);
                        u.i(findViewById4, "findViewById(...)");
                        this.f41806x = (TextView) findViewById4;
                        MaterialCardView materialCardView = this.f41805w;
                        if (materialCardView != null) {
                            materialCardView.setOnClickListener(new io.j(this, 2));
                            this.P = new int[0];
                            return;
                        }
                        u.s("noteTextContainer");
                        throw null;
                    }
                    u.s("recyclerView");
                    throw null;
                }
                u.s("recyclerView");
                throw null;
            }
            u.s("recyclerView");
            throw null;
        }
        u.s("recyclerView");
        throw null;
    }

    public final void setListener(a listener) {
        u.j(listener, "listener");
        this.B = listener;
    }
}
