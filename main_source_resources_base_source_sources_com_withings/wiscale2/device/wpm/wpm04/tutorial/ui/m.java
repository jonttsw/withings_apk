package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpm04TutorialProcessingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/m;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class m extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final b f55883c = new b(this);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55882e = {v.c(m.class, "processTextInfo", "getProcessTextInfo()Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/ProcessingTextInfo;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f55881d = new Object();

    /* compiled from: Wpm04TutorialProcessingFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Fragment, ProcessingTextInfo> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55884a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f55885b;

        public b(Fragment fragment) {
            this.f55885b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.ProcessingTextInfo] */
        @Override // bn0.d
        public final ProcessingTextInfo getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55884a.getValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_wpm04_tutorial_processing, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        FragmentActivity activity = getActivity();
        u.h(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(false);
            supportActionBar.o(false);
            supportActionBar.p(false);
        }
        fn0.k<Object>[] kVarArr = f55882e;
        fn0.k<Object> kVar = kVarArr[0];
        b bVar = this.f55883c;
        ((TextView) view.findViewById(C1987R.id.title)).setText(getString(((ProcessingTextInfo) bVar.getValue(this, kVar)).c()));
        ((TextView) view.findViewById(C1987R.id.message)).setText(getString(((ProcessingTextInfo) bVar.getValue(this, kVarArr[0])).b()));
        Integer a11 = ((ProcessingTextInfo) bVar.getValue(this, kVarArr[0])).a();
        if (a11 != null) {
            int intValue = a11.intValue();
            TextView textView = (TextView) view.findViewById(C1987R.id.info);
            textView.setVisibility(0);
            textView.setText(getString(intValue));
        }
    }
}
