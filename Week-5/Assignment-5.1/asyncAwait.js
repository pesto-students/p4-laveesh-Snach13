const doTask1 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("Task 1");
      rej("No task 1");
    }, Math.random() * 1000);
  });
};
const doTask2 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("Task 2");
      rej("No task 2");
    }, Math.random() * 1000);
  });
};
const doTask3 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("Task 3");
      rej("No task 3");
    }, Math.random() * 1000);
  });
};

const awaitFunc = async () => {
  try {
    const response1 = await doTask1();
    console.log(response1);
    const response2 = await doTask2();
    console.log(response2);
    const response3 = await doTask3();
    console.log(response3);
  } catch (error) {
    console.error(`async await error ${error}`);
  }
};

awaitFunc();

function* myGenerator() {
  yield doTask1()
    .then((val) => console.log(val))
    .catch((err) => console.error(err));
  yield doTask2()
    .then((val) => console.log(val))
    .catch((err) => console.error(err));
  yield doTask3()
    .then((val) => console.log(val))
    .catch((err) => console.error(err));
}

const gen = myGenerator();
gen.next();
gen.next();
gen.next();
gen.next();
