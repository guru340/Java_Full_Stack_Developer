export const Revenue = ({ title, amount }) => {
    return (
        <div className="bg-white rounded shadow-sm p-4">
            <div className="text-gray-500 text-sm">
                {title}
            </div>

            <div className="flex justify-between mt-2">
                <div className="text-xl font-semibold">
                    {amount}
                </div>
            </div>
        </div>
    );
};
