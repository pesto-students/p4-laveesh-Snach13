const mathOperations = require("./calculate");

test("Properly adds two numbers", () => {
  let result = mathOperations.sum(1, 2);
  expect(result).toBe(3);
});

test("Properly subtracts two numbers", () => {
  let result = mathOperations.diff(12, 2);
  expect(result).toBe(10);
});

test("Properly multiply two numbers", () => {
  let result = mathOperations.product(2, 2);
  expect(result).toBe(4);
});
