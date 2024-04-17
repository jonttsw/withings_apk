package com.withings.programs.model.webservice.enrolledProgram;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/* compiled from: WsIteration.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/enrolledProgram/WsIteration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsIteration$$serializer implements GeneratedSerializer<WsIteration> {
    public static final WsIteration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsIteration$$serializer wsIteration$$serializer = new WsIteration$$serializer();
        INSTANCE = wsIteration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.enrolledProgram.WsIteration", wsIteration$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("iteration", false);
        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.INSTANCE_ID, false);
        pluginGeneratedSerialDescriptor.addElement("progression", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsIteration$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, IntSerializer.INSTANCE, WsProgression$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsIteration deserialize(Decoder decoder) {
        int i11;
        int i12;
        WsProgression wsProgression;
        long j5;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 0);
            i11 = beginStructure.decodeIntElement(descriptor2, 1);
            wsProgression = (WsProgression) beginStructure.decodeSerializableElement(descriptor2, 2, WsProgression$$serializer.INSTANCE, null);
            i12 = 7;
            j5 = decodeLongElement;
        } else {
            boolean z5 = true;
            int i13 = 0;
            long j11 = 0;
            WsProgression wsProgression2 = null;
            int i14 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    j11 = beginStructure.decodeLongElement(descriptor2, 0);
                    i14 |= 1;
                } else if (decodeElementIndex == 1) {
                    i13 = beginStructure.decodeIntElement(descriptor2, 1);
                    i14 |= 2;
                } else if (decodeElementIndex != 2) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    wsProgression2 = (WsProgression) beginStructure.decodeSerializableElement(descriptor2, 2, WsProgression$$serializer.INSTANCE, wsProgression2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            wsProgression = wsProgression2;
            j5 = j11;
        }
        beginStructure.endStructure(descriptor2);
        return new WsIteration(i12, j5, i11, wsProgression, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsIteration value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsIteration.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
