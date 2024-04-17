package com.withings.library.sleep.platform;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DispatcherRepository.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/library/sleep/platform/DispatcherRepository;", "", "()V", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class DispatcherRepository {
    public final CoroutineDispatcher backgroundDispatcher() {
        return Dispatchers.getIO();
    }

    public final CoroutineDispatcher mainDispatcher() {
        return Dispatchers.getMain();
    }
}
