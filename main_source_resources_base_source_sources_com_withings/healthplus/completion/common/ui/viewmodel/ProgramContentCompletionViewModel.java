package com.withings.healthplus.completion.common.ui.viewmodel;

import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import ym0.l;
/* compiled from: ProgramContentCompletionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/completion/common/ui/viewmodel/ProgramContentCompletionViewModel;", "Lcom/withings/healthplus/completion/common/ui/viewmodel/a;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ProgramContentCompletionViewModel extends a {

    /* renamed from: c  reason: collision with root package name */
    private final xw.b f40007c;

    /* renamed from: d  reason: collision with root package name */
    private final tt.c f40008d;

    /* renamed from: e  reason: collision with root package name */
    private final tt.a f40009e;

    /* renamed from: f  reason: collision with root package name */
    private final NavigationArguments.ProgramInformation f40010f;

    /* renamed from: g  reason: collision with root package name */
    private final String f40011g;

    /* renamed from: h  reason: collision with root package name */
    private final long f40012h;

    /* renamed from: i  reason: collision with root package name */
    private final String f40013i;

    @Inject
    public ProgramContentCompletionViewModel(u0 savedStateHandle, xw.b dispatcher, tt.c completeTasksUseCase, tt.a aVar) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatcher, "dispatcher");
        u.j(completeTasksUseCase, "completeTasksUseCase");
        this.f40007c = dispatcher;
        this.f40008d = completeTasksUseCase;
        this.f40009e = aVar;
        NavigationArguments.ProgramInformation retrieveProgramInformation = NavigationArguments.ProgramInformation.Companion.retrieveProgramInformation(savedStateHandle);
        if (retrieveProgramInformation != null) {
            this.f40010f = retrieveProgramInformation;
            String str = (String) savedStateHandle.c(NavigationArguments.CONTENT_ID);
            if (str != null) {
                this.f40011g = str;
                Long l5 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
                if (l5 != null) {
                    this.f40012h = l5.longValue();
                    this.f40013i = retrieveProgramInformation.getProgramTaskId();
                    return;
                }
                throw new Exception("userId shouldn't be null");
            }
            throw new Exception("contentId shouldn't be null");
        }
        throw new Exception("programInformation shouldn't be null");
    }

    @Override // com.withings.healthplus.completion.common.ui.viewmodel.a
    public final long g0() {
        return this.f40012h;
    }

    public final void q0(ym0.a onCompletionFailure, l lVar) {
        u.j(onCompletionFailure, "onCompletionFailure");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f40007c.a(), null, new c(this, lVar, onCompletionFailure, null), 2, null);
    }

    public final String r0() {
        return this.f40013i;
    }

    public final String t0() {
        return this.f40011g;
    }
}
