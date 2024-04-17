package com.withings.wiscale2.legacyprograms;

import android.app.Application;
import com.withings.programs.model.program.DeviceDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.program.SpecificsDomain;
import com.withings.wiscale2.C1987R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "program", "", "invoke", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailViewModel$deviceSectionTitle$1 extends w implements l<ProgramDomain.LegacyDomain, String> {
    final /* synthetic */ WellnessProgramDetailViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailViewModel$deviceSectionTitle$1(WellnessProgramDetailViewModel wellnessProgramDetailViewModel) {
        super(1);
        this.this$0 = wellnessProgramDetailViewModel;
    }

    @Override // ym0.l
    public final String invoke(ProgramDomain.LegacyDomain legacyDomain) {
        Boolean bool;
        SpecificsDomain specifics;
        List<DeviceDomain> devices;
        if (legacyDomain == null || (specifics = legacyDomain.getSpecifics()) == null || (devices = specifics.getDevices()) == null) {
            bool = null;
        } else {
            List<DeviceDomain> list = devices;
            boolean z5 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((DeviceDomain) it.next()).getRequired()) {
                        z5 = true;
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z5);
        }
        Application application = this.this$0.getApplication();
        u.h(application, "null cannot be cast to non-null type android.content.Context");
        return application.getString(u.e(bool, Boolean.TRUE) ? C1987R.string._PROGRAM_DEVICE_REQUIRED_ : C1987R.string._PROGRAM_DEVICE_RECOMMENDED__);
    }
}
