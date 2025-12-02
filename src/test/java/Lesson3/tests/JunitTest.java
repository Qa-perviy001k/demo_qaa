package Lesson3.tests;

import org.junit.jupiter.api.*;

public class JunitTest {

    int result;

    @BeforeAll  //Метод, аннотированный этой аннотацией, будет выполнен один раз перед выполнением всех тестов в классе.
    // Он должен быть статическим.
    static void beforeAll() {
        System.out.println("###beforeAll()\n");


    }

    @BeforeEach // Метод с этой аннотацией будет выполнен перед каждым тестом.
        // Используется для подготовки условий для тестов.
    void beforeEach() {
        System.out.println("### beforeEach()");
        result = getResult();
    }

    @AfterEach //Метод с этой аннотацией будет выполнен после каждого теста.
        // Используется для очистки ресурсов или состояния после теста.
    void afterEach() {
        System.out.println("### afterEach()\n");
        result = 0;
    }

    @AfterAll // Этот метод будет выполнен один раз после выполнения всех тестов в классе.
    // Он также должен быть статическим.
    static void afterAll() {
        System.out.println("### afterAll()\n");

    }

    @Test // Это сама аннотация для тестового метода.
        // Методы, аннотированные этой аннотацией, будут выполнены как тесты.
    void firstTest() {
        System.out.println("### firstTest()");
        Assertions.assertTrue(result > 2);

    }

    @Test
    void secondTest() {
        System.out.println("### secondTest()");
        Assertions.assertTrue(result > 2);

    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTest()");
        Assertions.assertTrue(result > 2);

    }

    private int getResult() {
        return 3;
    }

}