package com.withings.programs.model.webservice.enrolledProgram;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsEnrolledProgram.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsEnrolledProgram$$serializer implements GeneratedSerializer<WsEnrolledProgram> {
    public static final WsEnrolledProgram$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsEnrolledProgram$$serializer wsEnrolledProgram$$serializer = new WsEnrolledProgram$$serializer();
        INSTANCE = wsEnrolledProgram$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.enrolledProgram.WsEnrolledProgram", wsEnrolledProgram$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.PROGRAM_ID, false);
        pluginGeneratedSerialDescriptor.addElement("modified", false);
        pluginGeneratedSerialDescriptor.addElement("deployment", false);
        pluginGeneratedSerialDescriptor.addElement("iterations", false);
        pluginGeneratedSerialDescriptor.addElement("specifics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsEnrolledProgram$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = WsEnrolledProgram.$childSerializers;
        return new KSerializer[]{IntSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[3], BuiltinSerializersKt.getNullable(WsSpecifics$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsEnrolledProgram deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        int i12;
        long j5;
        String str;
        List list;
        WsSpecifics wsSpecifics;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsEnrolledProgram.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 1);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 2);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            i11 = decodeIntElement;
            wsSpecifics = (WsSpecifics) beginStructure.decodeNullableSerializableElement(descriptor2, 4, WsSpecifics$$serializer.INSTANCE, null);
            str = decodeStringElement;
            i12 = 31;
            j5 = decodeLongElement;
        } else {
            long j11 = 0;
            boolean z5 = true;
            int i13 = 0;
            String str2 = null;
            List list2 = null;
            WsSpecifics wsSpecifics2 = null;
            int i14 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    i13 = beginStructure.decodeIntElement(descriptor2, 0);
                    i14 |= 1;
                } else if (decodeElementIndex == 1) {
                    j11 = beginStructure.decodeLongElement(descriptor2, 1);
                    i14 |= 2;
                } else if (decodeElementIndex == 2) {
                    str2 = beginStructure.decodeStringElement(descriptor2, 2);
                    i14 |= 4;
                } else if (decodeElementIndex == 3) {
                    list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list2);
                    i14 |= 8;
                } else if (decodeElementIndex != 4) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    wsSpecifics2 = (WsSpecifics) beginStructure.decodeNullableSerializableElement(descriptor2, 4, WsSpecifics$$serializer.INSTANCE, wsSpecifics2);
                    i14 |= 16;
                }
            }
            i11 = i13;
            i12 = i14;
            j5 = j11;
            str = str2;
            list = list2;
            wsSpecifics = wsSpecifics2;
        }
        beginStructure.endStructure(descriptor2);
        return new WsEnrolledProgram(i12, i11, j5, str, list, wsSpecifics, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsEnrolledProgram value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsEnrolledProgram.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
