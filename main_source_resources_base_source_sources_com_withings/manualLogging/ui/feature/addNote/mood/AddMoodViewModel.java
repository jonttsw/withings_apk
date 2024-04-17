package com.withings.manualLogging.ui.feature.addNote.mood;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.common.compose.component.q1;
import com.withings.features.FeatureFlag;
import com.withings.manualLogging.core.entity.MoodLevel;
import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
import com.withings.wiscale2.C1987R;
import hx.n;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import k1.o1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.c;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.j;
/* compiled from: AddMoodViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/mood/AddMoodViewModel;", "Landroidx/lifecycle/g1;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddMoodViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final n f41517a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f41518b;

    /* renamed from: c  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41519c;

    /* renamed from: d  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41520d;

    /* renamed from: e  reason: collision with root package name */
    private final o1<SaveManualLogButtonStatus> f41521e;

    /* compiled from: AddMoodViewModel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<MoodLevel> f41522a = sm0.b.a(MoodLevel.values());
    }

    /* compiled from: AddMoodViewModel.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<SaveManualLogButtonStatus> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final SaveManualLogButtonStatus invoke() {
            AddMoodViewModel addMoodViewModel = AddMoodViewModel.this;
            if (((Boolean) addMoodViewModel.f41519c.getValue()).booleanValue()) {
                return SaveManualLogButtonStatus.f41669c;
            }
            if (!wr.b.c(FeatureFlag.f39130s0)) {
                return SaveManualLogButtonStatus.f41668b;
            }
            if (addMoodViewModel.m0().getValue() != 0) {
                return SaveManualLogButtonStatus.f41668b;
            }
            return SaveManualLogButtonStatus.f41667a;
        }
    }

    @Inject
    public AddMoodViewModel(n nVar, u0 state) {
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        u.j(state, "state");
        this.f41517a = nVar;
        this.f41518b = (Long) state.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        f11 = l0.f(Boolean.FALSE, v0.f8878a);
        this.f41519c = f11;
        f12 = l0.f(null, v0.f8878a);
        this.f41520d = f12;
        this.f41521e = l0.e(new b());
    }

    public static ArrayList j0() {
        j jVar;
        sm0.a<MoodLevel> aVar = a.f41522a;
        ArrayList arrayList = new ArrayList(x.y(aVar, 10));
        Iterator it = ((c) aVar).iterator();
        while (it.hasNext()) {
            MoodLevel moodLevel = (MoodLevel) it.next();
            u.j(moodLevel, "<this>");
            int ordinal = moodLevel.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                jVar = new j(Integer.valueOf((int) C1987R.string.manualLogging_sleepLogScreen_energized), Integer.valueOf((int) C1987R.drawable.ic_happy));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            jVar = new j(Integer.valueOf((int) C1987R.string.manualLogging_sleepLogScreen_rested), Integer.valueOf((int) C1987R.drawable.ic_good));
                        }
                    } else {
                        jVar = new j(Integer.valueOf((int) C1987R.string.manualLogging_sleepLogScreen_okay), Integer.valueOf((int) C1987R.drawable.ic_okay));
                    }
                } else {
                    jVar = new j(Integer.valueOf((int) C1987R.string.manualLogging_sleepLogScreen_tired), Integer.valueOf((int) C1987R.drawable.ic_sad));
                }
            } else {
                jVar = new j(Integer.valueOf((int) C1987R.string.manualLogging_sleepLogScreen_exhausted), Integer.valueOf((int) C1987R.drawable.ic_unhappy));
            }
            arrayList.add(new q1.a(moodLevel.a(), ((Number) jVar.a()).intValue(), ((Number) jVar.b()).intValue()));
        }
        return arrayList;
    }

    public final o1<SaveManualLogButtonStatus> k0() {
        return this.f41521e;
    }

    public final ParcelableSnapshotMutableState m0() {
        return this.f41520d;
    }

    public final void p0(int i11) {
        this.f41520d.setValue(Integer.valueOf(i11));
    }

    public final void q0() {
        this.f41519c.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.manualLogging.ui.feature.addNote.mood.a(this, false, null), 2, null);
    }
}
