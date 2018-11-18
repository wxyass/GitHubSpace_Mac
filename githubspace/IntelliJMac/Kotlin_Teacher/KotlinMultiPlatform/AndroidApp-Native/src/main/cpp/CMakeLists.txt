cmake_minimum_required(VERSION 3.4.1)

set(PREBUILT ${CMAKE_SOURCE_DIR}/../../../../Android-Native/build)
set(KOTLIN_LIB_NAME kotlinmultiplatform_native_android)

add_library(hello-jni SHARED
            hello-jni.c)

target_include_directories(hello-jni PRIVATE
                      ${PREBUILT}/include)

add_library(${KOTLIN_LIB_NAME} SHARED IMPORTED)
set_target_properties(${KOTLIN_LIB_NAME} PROPERTIES
                    IMPORTED_LOCATION "${PREBUILT}/libs/armeabi-v7a/lib${KOTLIN_LIB_NAME}.so"
                    IMPORTED_NO_SONAME ON)

# Include libraries needed for hello-jni lib
target_link_libraries(hello-jni
                      android
                      log
                      ${KOTLIN_LIB_NAME})
