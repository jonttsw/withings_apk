package com.withings.wiscale2;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.features.TestSetting;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.core.model.TabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class i2 implements ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MainActivity f57860a;

    /* compiled from: MainActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.MainActivity$setupPager$3$onPageSelected$1", f = "MainActivity.kt", l = {ConstantsWs.WS_STATUS_ERROR_CONFIRMATION_CODE}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MainActivity f57862b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f57863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MainActivity mainActivity, int i11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57862b = mainActivity;
            this.f57863c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f57862b, this.f57863c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ch0.d R3;
            ArrayList arrayList;
            v60.a aVar;
            Object obj2;
            ch0.d R32;
            Object obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57861a;
            MainActivity mainActivity = this.f57862b;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                R3 = mainActivity.R3();
                SharedFlow m02 = R3.m0();
                this.f57861a = 1;
                obj = FlowKt.first(m02, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List list = (List) obj;
            arrayList = mainActivity.f47957i;
            Fragment fragment = (Fragment) arrayList.get(this.f57863c);
            if (fragment instanceof com.withings.measurements.ui.i2) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((v60.a) obj3).b() == TabType.f44589c) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                aVar = (v60.a) obj3;
            } else if (fragment instanceof q30.a) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((v60.a) obj2).b() == TabType.f44588b) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                aVar = (v60.a) obj2;
            } else {
                aVar = null;
            }
            if (aVar != null && !aVar.a()) {
                R32 = mainActivity.R3();
                R32.R0(aVar.b());
                ch.d dVar = mainActivity.f47960l;
                if (dVar != null) {
                    ah.l k11 = dVar.k();
                    String tabType = aVar.b().name();
                    k11.getClass();
                    kotlin.jvm.internal.u.j(tabType, "tabType");
                    Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(mainActivity.getPackageName(), "com.withings.tutorials.ui.screens.tab.TabPresentationActivity").putExtra("tab_type", tabType);
                    kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                    mainActivity.startActivity(putExtra);
                } else {
                    kotlin.jvm.internal.u.s("intentBuilder");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(MainActivity mainActivity) {
        this.f57860a = mainActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        if (!wr.b.c(TestSetting.f39177l)) {
            MainActivity mainActivity = this.f57860a;
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(mainActivity), null, null, new a(mainActivity, i11, null), 3, null);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
    }
}
