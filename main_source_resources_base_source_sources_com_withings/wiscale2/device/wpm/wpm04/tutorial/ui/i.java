package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.withings.device.details.scale.z;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpm04TutorialErrorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class i extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private b f55867c;

    /* renamed from: d  reason: collision with root package name */
    private final c f55868d = new c(this);

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55866f = {v.c(i.class, "errorInfo", "getErrorInfo()Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ErrorInfo;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final a f55865e = new Object();

    /* compiled from: Wpm04TutorialErrorFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Wpm04TutorialErrorFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void k1();

        void o1();

        void r2();
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, ErrorInfo> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55869a = nm0.h.b(new j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f55870b;

        public c(Fragment fragment) {
            this.f55870b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.wiscale2.device.wpm.wpm04.tutorial.ErrorInfo] */
        @Override // bn0.d
        public final ErrorInfo getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55869a.getValue();
        }
    }

    public static void s1(i this$0) {
        u.j(this$0, "this$0");
        if (this$0.v1().g()) {
            b bVar = this$0.f55867c;
            if (bVar != null) {
                bVar.k1();
                return;
            }
            return;
        }
        b bVar2 = this$0.f55867c;
        if (bVar2 != null) {
            bVar2.r2();
        }
    }

    public static void t1(i this$0) {
        u.j(this$0, "this$0");
        b bVar = this$0.f55867c;
        if (bVar != null) {
            bVar.o1();
        }
    }

    private final ErrorInfo v1() {
        return (ErrorInfo) this.f55868d.getValue(this, f55866f[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_wpm04_tutorial_error, viewGroup, false);
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
        ((TextView) view.findViewById(C1987R.id.title)).setText(getString(v1().f()));
        ((TextView) view.findViewById(C1987R.id.subtitle)).setText(getString(v1().c()));
        ((ImageView) view.findViewById(C1987R.id.image)).setImageResource(v1().d());
        Button button = (Button) view.findViewById(C1987R.id.main_button);
        button.setText(getString(v1().e()));
        button.setOnClickListener(new sg.b(this, 14));
        Integer b10 = v1().b();
        if (b10 != null) {
            int intValue = b10.intValue();
            Button button2 = (Button) view.findViewById(C1987R.id.cancel_button);
            button2.setVisibility(0);
            button2.setText(getString(intValue));
            button2.setOnClickListener(new z(this, 12));
        }
    }
}
