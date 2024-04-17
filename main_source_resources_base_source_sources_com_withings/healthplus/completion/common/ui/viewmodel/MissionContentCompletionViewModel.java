package com.withings.healthplus.completion.common.ui.viewmodel;

import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import ym0.l;
/* compiled from: MissionContentCompletionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/completion/common/ui/viewmodel/MissionContentCompletionViewModel;", "Lcom/withings/healthplus/completion/common/ui/viewmodel/a;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MissionContentCompletionViewModel extends a {

    /* renamed from: c  reason: collision with root package name */
    private final xw.b f40000c;

    /* renamed from: d  reason: collision with root package name */
    private final tt.c f40001d;

    /* renamed from: e  reason: collision with root package name */
    private final tt.a f40002e;

    /* renamed from: f  reason: collision with root package name */
    private final NavigationArguments.MissionInformation f40003f;

    /* renamed from: g  reason: collision with root package name */
    private final long f40004g;

    /* renamed from: h  reason: collision with root package name */
    private final String f40005h;

    /* renamed from: i  reason: collision with root package name */
    private final String f40006i;

    @Inject
    public MissionContentCompletionViewModel(u0 savedStateHandle, xw.b dispatcher, tt.c completeTasksUseCase, tt.a aVar) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatcher, "dispatcher");
        u.j(completeTasksUseCase, "completeTasksUseCase");
        this.f40000c = dispatcher;
        this.f40001d = completeTasksUseCase;
        this.f40002e = aVar;
        NavigationArguments.MissionInformation retrieveMissionInformation = NavigationArguments.MissionInformation.Companion.retrieveMissionInformation(savedStateHandle);
        if (retrieveMissionInformation != null) {
            this.f40003f = retrieveMissionInformation;
            Long l5 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
            if (l5 != null) {
                this.f40004g = l5.longValue();
                String str = (String) savedStateHandle.c(NavigationArguments.CONTENT_ID);
                if (str != null) {
                    this.f40005h = str;
                    this.f40006i = String.valueOf(retrieveMissionInformation.getMissionId());
                    return;
                }
                throw new Exception("contentId shouldn't be null");
            }
            throw new Exception("userId shouldn't be null");
        }
        throw new Exception("missionInformation shouldn't be null");
    }

    @Override // com.withings.healthplus.completion.common.ui.viewmodel.a
    public final long g0() {
        return this.f40004g;
    }

    public final void q0(ym0.a onCompletionFailure, l lVar) {
        u.j(onCompletionFailure, "onCompletionFailure");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f40000c.a(), null, new b(this, lVar, onCompletionFailure, null), 2, null);
    }

    public final String r0() {
        return this.f40006i;
    }

    public final String t0() {
        return this.f40005h;
    }
}
