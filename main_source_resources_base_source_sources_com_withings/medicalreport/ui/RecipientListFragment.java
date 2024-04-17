package com.withings.medicalreport.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.g1;
import androidx.lifecycle.k0;
import androidx.lifecycle.k1;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.medicalreport.model.Contact;
import com.withings.medicalreport.model.ContactIdentifier;
import com.withings.medicalreport.model.PersonnalContact;
import com.withings.medicalreport.model.ProfessionalContact;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
/* compiled from: RecipientListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/medicalreport/ui/RecipientListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RecipientListFragment extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private TextView f42210c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f42211d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f42212e;

    /* renamed from: f  reason: collision with root package name */
    private RadioGroup f42213f;

    /* renamed from: g  reason: collision with root package name */
    private final r8.g f42214g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f42215h;

    /* renamed from: i  reason: collision with root package name */
    private a f42216i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f42217j;

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void L2(String str);
    }

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    public static final class b extends g1 {

        /* renamed from: a  reason: collision with root package name */
        private final k0 f42218a;

        /* renamed from: b  reason: collision with root package name */
        private final k0 f42219b;

        /* renamed from: c  reason: collision with root package name */
        private final k0 f42220c;

        /* renamed from: d  reason: collision with root package name */
        private final k0 f42221d;

        public b(boolean z5) {
            int i11;
            int i12;
            int i13;
            Object entries;
            if (z5) {
                i11 = C1987R.string.profile_medicalReport_profesionalOption_title;
            } else {
                i11 = C1987R.string.profile_medicalReport_otherOption_title;
            }
            this.f42218a = xw.d.a(Integer.valueOf(i11));
            if (z5) {
                i12 = C1987R.string.profile_medicalReport_profesionalOption_description;
            } else {
                i12 = C1987R.string.profile_medicalReport_otherOption_description;
            }
            this.f42219b = xw.d.a(Integer.valueOf(i12));
            if (z5) {
                i13 = 2131232245;
            } else {
                i13 = 2131232246;
            }
            this.f42220c = xw.d.a(Integer.valueOf(i13));
            if (z5) {
                entries = ProfessionalContact.getEntries();
            } else {
                entries = PersonnalContact.getEntries();
            }
            this.f42221d = xw.d.a(entries);
        }

        public final k0 f0() {
            return this.f42221d;
        }

        public final k0 g0() {
            return this.f42219b;
        }

        public final k0 i0() {
            return this.f42220c;
        }

        public final k0 j0() {
            return this.f42218a;
        }
    }

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            int intValue = num.intValue();
            RecipientListFragment recipientListFragment = RecipientListFragment.this;
            TextView textView = recipientListFragment.f42210c;
            if (textView != null) {
                textView.setText(recipientListFragment.getString(intValue));
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("title");
            throw null;
        }
    }

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            int intValue = num.intValue();
            RecipientListFragment recipientListFragment = RecipientListFragment.this;
            TextView textView = recipientListFragment.f42211d;
            if (textView != null) {
                textView.setText(recipientListFragment.getString(intValue));
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s(HealthConstants.FoodInfo.DESCRIPTION);
            throw null;
        }
    }

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            int intValue = num.intValue();
            RecipientListFragment recipientListFragment = RecipientListFragment.this;
            ImageView imageView = recipientListFragment.f42212e;
            if (imageView != null) {
                imageView.setImageDrawable(androidx.core.content.a.getDrawable(recipientListFragment.requireContext(), intValue));
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s(HealthUserProfile.USER_PROFILE_KEY_IMAGE);
            throw null;
        }
    }

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<List<? extends Contact>, nm0.y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends Contact> list) {
            List<? extends Contact> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            RecipientListFragment.x1(RecipientListFragment.this, it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f42226a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f42226a = fragment;
        }

        @Override // ym0.a
        public final Bundle invoke() {
            Fragment fragment = this.f42226a;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.fragment.app.o.c("Fragment ", fragment, " has null arguments"));
        }
    }

    /* compiled from: RecipientListFragment.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<b> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            RecipientListFragment recipientListFragment = RecipientListFragment.this;
            return (b) new k1(recipientListFragment, new c0(recipientListFragment)).a(b.class);
        }
    }

    public RecipientListFragment() {
        super(C1987R.layout.fragment_recipient_list);
        this.f42214g = new r8.g(q0.b(d0.class), new g(this));
        this.f42215h = nm0.h.b(new h());
    }

    public static void s1(RecipientListFragment this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.f42217j = Integer.valueOf(i11);
        a aVar = this$0.f42216i;
        if (aVar != null) {
            aVar.L2(ContactIdentifier.INSTANCE.getContactFromIdentifier(i11).getKey());
        }
    }

    public static final d0 t1(RecipientListFragment recipientListFragment) {
        return (d0) recipientListFragment.f42214g.getValue();
    }

    public static final void x1(final RecipientListFragment recipientListFragment, List list) {
        recipientListFragment.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            RadioButton radioButton = new RadioButton(recipientListFragment.requireContext());
            radioButton.setText(recipientListFragment.getString(contact.getDescriptionResId()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int dimension = (int) recipientListFragment.getResources().getDimension(C1987R.dimen.keyline_1);
            layoutParams.leftMargin = dimension;
            radioButton.setLayoutParams(layoutParams);
            radioButton.setPadding(dimension, dimension, dimension, dimension);
            radioButton.setTextAppearance(C1987R.style.body1);
            radioButton.setId(contact.getIdentifier());
            RadioGroup radioGroup = recipientListFragment.f42213f;
            if (radioGroup != null) {
                radioGroup.addView(radioButton);
            } else {
                kotlin.jvm.internal.u.s("radioGroup");
                throw null;
            }
        }
        RadioGroup radioGroup2 = recipientListFragment.f42213f;
        if (radioGroup2 != null) {
            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.withings.medicalreport.ui.b0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup3, int i11) {
                    RecipientListFragment.s1(RecipientListFragment.this, i11);
                }
            });
            Integer num = recipientListFragment.f42217j;
            if (num != null) {
                int intValue = num.intValue();
                RadioGroup radioGroup3 = recipientListFragment.f42213f;
                if (radioGroup3 != null) {
                    radioGroup3.check(intValue);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("radioGroup");
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.u.s("radioGroup");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f42216i = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f42216i = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.title);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f42210c = (TextView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.description);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f42211d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.image);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f42212e = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.contacts_list);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f42213f = (RadioGroup) findViewById4;
        b bVar = (b) this.f42215h.getValue();
        xw.d.c(this, bVar.j0(), new c());
        xw.d.c(this, bVar.g0(), new d());
        xw.d.c(this, bVar.i0(), new e());
        xw.d.c(this, bVar.f0(), new f());
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }
}
