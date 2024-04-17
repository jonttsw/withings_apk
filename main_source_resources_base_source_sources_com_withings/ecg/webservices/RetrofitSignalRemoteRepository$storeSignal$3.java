package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitSignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "Lcom/withings/ecg/webservices/SignalRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.RetrofitSignalRemoteRepository$storeSignal$3", f = "RetrofitSignalRemoteRepository.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSignalRemoteRepository$storeSignal$3 extends i implements p<SignalRetrofit2Api, d<? super StoreSignalResponse>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $duration;
    final /* synthetic */ Integer $firmwareVersion;
    final /* synthetic */ int $metaChannel;
    final /* synthetic */ long $metaFilterBank;
    final /* synthetic */ long $metaFix;
    final /* synthetic */ int $metaFormat;
    final /* synthetic */ int $metaFreq;
    final /* synthetic */ int $metaGain;
    final /* synthetic */ int $metaOffset;
    final /* synthetic */ int $metaResolution;
    final /* synthetic */ int $metaSize;
    final /* synthetic */ Integer $metaWearPosition;
    final /* synthetic */ String $signal;
    final /* synthetic */ int $signalType;
    final /* synthetic */ long $timestamp;
    final /* synthetic */ long $totalSize;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSignalRemoteRepository$storeSignal$3(String str, long j5, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, long j14, long j15, long j16, Integer num, Integer num2, d<? super RetrofitSignalRemoteRepository$storeSignal$3> dVar) {
        super(2, dVar);
        this.$signal = str;
        this.$userId = j5;
        this.$signalType = i11;
        this.$timestamp = j11;
        this.$metaFreq = i12;
        this.$metaFormat = i13;
        this.$metaSize = i14;
        this.$metaResolution = i15;
        this.$metaChannel = i16;
        this.$metaGain = i17;
        this.$metaFix = j12;
        this.$metaOffset = i18;
        this.$deviceId = j13;
        this.$duration = j14;
        this.$totalSize = j15;
        this.$metaFilterBank = j16;
        this.$metaWearPosition = num;
        this.$firmwareVersion = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSignalRemoteRepository$storeSignal$3 retrofitSignalRemoteRepository$storeSignal$3 = new RetrofitSignalRemoteRepository$storeSignal$3(this.$signal, this.$userId, this.$signalType, this.$timestamp, this.$metaFreq, this.$metaFormat, this.$metaSize, this.$metaResolution, this.$metaChannel, this.$metaGain, this.$metaFix, this.$metaOffset, this.$deviceId, this.$duration, this.$totalSize, this.$metaFilterBank, this.$metaWearPosition, this.$firmwareVersion, dVar);
        retrofitSignalRemoteRepository$storeSignal$3.L$0 = obj;
        return retrofitSignalRemoteRepository$storeSignal$3;
    }

    @Override // ym0.p
    public final Object invoke(SignalRetrofit2Api signalRetrofit2Api, d<? super StoreSignalResponse> dVar) {
        return ((RetrofitSignalRemoteRepository$storeSignal$3) create(signalRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l.b(obj);
        SignalRetrofit2Api signalRetrofit2Api = (SignalRetrofit2Api) this.L$0;
        String str = this.$signal;
        long j5 = this.$userId;
        int i12 = this.$signalType;
        long j11 = this.$timestamp;
        int i13 = this.$metaFreq;
        int i14 = this.$metaFormat;
        int i15 = this.$metaSize;
        int i16 = this.$metaResolution;
        int i17 = this.$metaChannel;
        int i18 = this.$metaGain;
        long j12 = this.$metaFix;
        int i19 = this.$metaOffset;
        long j13 = this.$deviceId;
        long j14 = this.$duration;
        long j15 = this.$totalSize;
        long j16 = this.$metaFilterBank;
        Integer num = this.$metaWearPosition;
        Integer num2 = this.$firmwareVersion;
        this.label = 1;
        Object storeSignal = signalRetrofit2Api.storeSignal(str, j5, i12, j11, i13, i14, i15, i16, i17, i18, j12, i19, j13, j14, j15, j16, num, num2, this);
        if (storeSignal == coroutineSingletons) {
            return coroutineSingletons;
        }
        return storeSignal;
    }
}
